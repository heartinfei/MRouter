package com.apeman.mrouter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.apeman.mrouter.router.MRouter;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        MRouter.of("/login")
                .launch(this, "wangqiang", "123");
    }
}
