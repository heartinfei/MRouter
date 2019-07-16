package com.apeman.route_lib.annotation;

import com.apeman.route_lib.ActionTask;
import com.apeman.route_lib.NONE;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 路由框架注解
 *
 * @author Rango on 2019-07-16 wangqiang@smzdm.com
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MTask {
    /**
     * 依赖信息
     */
    Class<? extends ActionTask> dependence() default NONE.class;
}

