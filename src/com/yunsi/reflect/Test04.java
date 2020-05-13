package com.yunsi.reflect;

public class Test04 {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(A.m);
        /*
        * 1.加载到内存，会产生一个对应的Class对象
        * 2.连接，连接结束后m=0
        * 3.初始化
        *       <clinit>(){
        *           System.out.println("A类静态代码块初始化")
        *           m=300;
        *           m=100;
        *       }
        * */
    }
}

class A{

    static {
        System.out.println("A类静态代码块初始化");
        m=300;
    }

    static int m=100;

    public A(){
        System.out.println("A类的无参数构造初始化");
    }
}
