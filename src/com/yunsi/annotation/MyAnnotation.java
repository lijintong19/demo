package com.yunsi.annotation;

import java.lang.annotation.*;

@Myannotation//这个是自定义的注解
public class MyAnnotation {

}
//@Target表示我们的注解可以用在哪些地方
@Target(value={ElementType.METHOD,ElementType.TYPE})
//runtime>class>sources
@Documented//表示是否将我们的注解生成在JAVAdoc中
//@Retention表示我们的注解在什么地方还有效
@Retention(value = RetentionPolicy.RUNTIME)


//定义一个注解
    @Inherited//说明子类可以继承父类中的注解
@interface Myannotation {

}
