package com.yunsi.factory.Method;

public class BaomaFactory implements CarFactory {
    @Override
    public Car getcar() {
        return new Baoma();
    }
}
