package com.apeman.route_lib;

import io.reactivex.Observable;

/**
 * @author Rango on 2019-07-17 wangqiang@smzdm.com
 */
public abstract class ActionTask {
    private ActionTask next = null;


    public Observable<Boolean> exec() {
        if (doTask()) {
            return next != null ? next.exec() : Observable.just(true);
        } else {
            return Observable.just(false);
        }
    }

    protected abstract boolean doTask();

    public ActionTask setNext(ActionTask t) {
        this.next = t;
        return this;
    }

}
