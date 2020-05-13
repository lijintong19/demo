package com.yunsi.father;

public class Son extends Fu {
    static {
        System.out.println("子类的静态代码块");
    }

    public static void test2(){
        System.out.println("子类的静态方法");
    }

    public static void main(String[] args) {
        Son son=new Son();
        son.test();
        System.out.println("------------------------");
        Son.test2();
    }
}
