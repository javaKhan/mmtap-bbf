package com.mmtap.bbf.datasources.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 * @author mmtap.com
 * @email java_khan@126.com
 * @date 2018-03-15 10:45
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String name() default "";
}
