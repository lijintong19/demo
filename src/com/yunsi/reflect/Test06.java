package com.yunsi.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test06 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("com.yunsi.reflect.User");
        System.out.println(c1.getName());//获取包名和类名
        System.out.println(c1.getSimpleName());//只获取类名

        //获取类的属性
        Field[] fields=c1.getFields();//只能获得public属性
        for (Field field : fields) {
            System.out.println(field);
        }

        Field[] field2=c1.getDeclaredFields();//可以获取所有属性
        for (Field field : field2) {
            System.out.println(field);
        }

        //获取指定的方法  c1.getField()获取public的指定方法
        Field name = c1.getDeclaredField("name");
        System.out.println(name);
        System.out.println("================================");
        //获取本类的所有的方法
        Method[] methods = c1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("================================");
        //获取本类及父类的所有共有方法public
        Method[] methods1 = c1.getMethods();
        for (Method method : methods1) {
            System.out.println(method);
        }
        System.out.println("通过反射获取构造器");
        Constructor[] constructors = c1.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }
}
