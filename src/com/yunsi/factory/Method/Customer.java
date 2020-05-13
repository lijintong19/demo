package com.yunsi.factory.Method;

public class Customer {
    public static void main(String[] args) {
        Car car = new BaomaFactory().getcar();
        car.getName();
    }
}
