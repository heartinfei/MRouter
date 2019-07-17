package com.apeman.mrouter;

import android.app.Application;
import io.github.heartinfei.slogger.S;
import io.github.heartinfei.slogger.SConfiguration;
import io.github.heartinfei.slogger.plan.DebugPlan;

/**
 * @author Rango on 2019-07-17 wangqiang@smzdm.com
 */
public class RApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SConfiguration c = new SConfiguration()
                .setPrintThreadInfo(false)
                .setPrintTrackInfo(false)
                .setTrackFilter(BuildConfig.APPLICATION_ID);
        S.init(c).addPlans(new DebugPlan());
    }
}
