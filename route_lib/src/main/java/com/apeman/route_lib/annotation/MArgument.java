package com.apeman.route_lib.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义参数信息
 *
 * @author Rango on 2019-07-16 wangqiang@smzdm.com
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MArgument {
    String key();

    Class type();
}
