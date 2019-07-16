package com.apeman.route_lib;

import io.reactivex.Observable;

/**
 * 实现该接口的类，可以提供条件查询结果
 *
 * @author Rango on 2019-07-17 wangqiang@smzdm.com
 */
public interface Queryable<T> {

    /**
     * 查询条件满足情况
     *
     * @param key
     * @return
     */
    public Observable<T> query(String key);
}
