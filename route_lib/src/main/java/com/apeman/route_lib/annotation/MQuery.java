package com.apeman.route_lib.annotation;

/**
 * @author Rango on 2019-07-17 wangqiang@smzdm.com
 */

import com.apeman.route_lib.Queryable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MQuery {
    String key();

    Class<? extends Queryable> clsName();
}
