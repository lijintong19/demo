package com.yunsi.factory.Simple;

public class Customer {
    public static void main(String[] args) {
        //使用工厂的方式获取对象。
        //不用再去new一个具体的对象了，此时我们只要告诉工厂我们需要什么对象就可以，不用再关注实现类的具体实现方式。
        Car car1 = CarFactory.getCar("特斯拉");
        Car car2 = CarFactory.getCar("宝马");

        car1.getName();
        car2.getName();

    }
}
