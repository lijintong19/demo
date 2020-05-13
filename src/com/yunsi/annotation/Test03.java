package com.yunsi.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test03 {
    //注解可以显示的复制，如果没有默认值，我们就必须给注解赋值
    @MyAnnotationTwo(name = "李诚",id=9)
    public  void test(){}
}

//自定义注解
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotationTwo{
    //注解的餐胡：参数类型+参数名 ();
    String name();
    int id();
    String[] args() default {"大西瓜","郎溪"};
    int add() default -1;//默认值-1代表不存在；
}