package com.yunsi.factory.Simple;

public class CarFactory {
    public static Car getCar(String name){
        if (name.equals("特斯拉")){
            return new Tesila();
        }else if (name.equals("宝马")){
            return new Baoma();
        }
        return null;
    }
}
