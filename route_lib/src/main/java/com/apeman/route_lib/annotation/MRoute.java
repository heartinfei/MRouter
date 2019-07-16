package com.apeman.route_lib.annotation;

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
public @interface MRoute {
    /**
     * 路径信息，跳转的唯一标示参考ARouter
     */
    String path();

    MArgument[] args() default {};

    MQuery[] query() default {};
}

