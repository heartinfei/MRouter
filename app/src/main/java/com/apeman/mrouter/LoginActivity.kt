package com.apeman.mrouter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.apeman.route_lib.Queryable
import com.apeman.route_lib.annotation.MArgument
import com.apeman.route_lib.annotation.MQuery
import com.apeman.route_lib.annotation.MRoute
import io.reactivex.Observable
import kotlinx.android.synthetic.main.activity_login.*

@MRoute(
    path = "/login",
    args = [MArgument(key = "name", type = String::class), MArgument(key = "psw", type = String::class)],
    query = [MQuery(key = "isLogin", clsName = LoginActivity::class)]
)
class LoginActivity : AppCompatActivity(), Queryable<Boolean> {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnMain.setOnClickListener {
            Intent(this, MainActivity::class.java).apply {
                startActivity(this)
            }
        }
    }

    override fun query(key: String?): Observable<Boolean> {
        return Observable.just(true)
    }

    //TODO: 该部分代码为注解自动生成
    //start
    companion object Launcher {

        fun launch(ctx: Context, name: String, psw: String) {
            Intent().apply {
                putExtra("name", name)
                putExtra("psw", psw)
                ctx.startActivity(this)
            }
        }
    }//end
}
