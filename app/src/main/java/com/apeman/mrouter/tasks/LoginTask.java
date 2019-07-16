package com.apeman.mrouter.tasks;

import com.apeman.route_lib.ActionTask;
import com.apeman.route_lib.annotation.MTask;
import io.github.heartinfei.slogger.S;

/**
 * 登陆Task
 *
 * @author Rango on 2019-07-17 wangqiang@smzdm.com
 */
@MTask
public class LoginTask extends ActionTask {
    @Override
    protected boolean doTask() {
        S.i("Login Success");
        return true;
    }
}
