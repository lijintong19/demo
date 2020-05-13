package com.yunsi.reflect;

//测试类什么时候会初始化
public class Test05 {
    static{
        System.out.println("Main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //1.主动引用(注意：若子类的父类没有初始化，会先初始化父类再初始化子类)
        //Son son=new Son();

        //反射也会产生主动应用
        //Class.forName("com.yunsi.reflect.Son");

        //不会产生类的引用的方法
       //System.out.println(Son.M);
    }
}

class Father{
    static{
        System.out.println("父类被加载");
    }
}

class Son extends Father{
    static{
        System.out.println("子类被加载");
        m=300;
    }

    static int m=100;
    static final int M=1;
}
