package com.norman.config.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 在controller的方法中，添加此注解会跳过token验证
 * Target：定义注解的作用目标
 * ElementType.METHOD 方法
 * Retention(RetentionPolicy.RUNTIME)：注解会在class字节码文件中存在，在运行时可以通过反射获取到
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SkipTokenValidate {
}
