package com.kyj.demo.datasources.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 * @author kangyuanjia
 * @createTime 2018-04-10 00:08:37
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String name() default "";
}
