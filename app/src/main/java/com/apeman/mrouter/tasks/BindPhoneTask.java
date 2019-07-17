package com.apeman.mrouter.tasks;

import com.apeman.route_lib.ActionTask;
import com.apeman.route_lib.annotation.MTask;
import io.github.heartinfei.slogger.S;

/**
 * 绑定手机Task
 *
 * @author Rango on 2019-07-17 wangqiang@smzdm.com
 */
@MTask(dependence = LoginTask.class)
public class BindPhoneTask extends ActionTask {
    @Override
    protected boolean doTask() {
        S.withTag("Task").i("BindPhone Success");
        return true;
    }
}
