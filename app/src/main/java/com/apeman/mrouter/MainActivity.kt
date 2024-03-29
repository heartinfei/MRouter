package com.apeman.mrouter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.apeman.mrouter.router.MRouter
import com.apeman.mrouter.tasks.BindPhoneTask

class MainActivity : AppCompatActivity() ,View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(v: View?) {
        MRouter.tasks(BindPhoneTask()).exec()
    }
}
