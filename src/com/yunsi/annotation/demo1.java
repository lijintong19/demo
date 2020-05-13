package com.yunsi.annotation;

//什么是注解，一下是三个内置注解
@SuppressWarnings("all")//抑制所有警告的注解
public class demo1 extends Object{

    //@Override 重写的注解
    @Override
    public String toString() {
        return "demo1{}";
    }

    // @Deprecated 不推荐程序员使用，但是可以使用，或者存在更好的方式
    @Deprecated
    public static void test(){
        System.out.println("Deprecated");
    }

    public static void main(String[] args) {
        test();
    }
}
