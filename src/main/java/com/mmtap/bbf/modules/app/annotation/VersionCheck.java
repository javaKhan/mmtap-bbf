package com.mmtap.bbf.modules.app.annotation;

import java.lang.annotation.*;

/**
 * app版本校验
 * @author mmtap.com
 * @email java_khan@126.com
 * @date 2018-03-15 10:45
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface VersionCheck {
}
