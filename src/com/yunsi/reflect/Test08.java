package com.yunsi.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//分析性能问题
public class Test08 {
    //普通方式调用
    public static void test01(){
        User uer=new User();
        long startTime=System.currentTimeMillis();
        for(int i=0;i<1000000000;i++){
            uer.getName();
        }
        long endTime=System.currentTimeMillis();

        System.out.println("普通方式执行10亿次"+(endTime-startTime)+"ms");
    }

    //反射方式调用
    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User uer=new User();
        Class uerClass = uer.getClass();
        Method getName = uerClass.getMethod("getName", null);
        long startTime=System.currentTimeMillis();
        for(int i=0;i<1000000000;i++){
            getName.invoke(uer,null);
        }
        long endTime=System.currentTimeMillis();

        System.out.println("反射方式执行10亿次"+(endTime-startTime)+"ms");
    }

    //反射范式调用，关闭检测
    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User uer=new User();
        Class uerClass = uer.getClass();
        Method getName = uerClass.getMethod("getName", null);
        getName.setAccessible(true);
        long startTime=System.currentTimeMillis();
        for(int i=0;i<1000000000;i++){
            getName.invoke(uer,null);
        }
        long endTime=System.currentTimeMillis();

        System.out.println("反射方式执行10亿次"+(endTime-startTime)+"ms");
    }

    //反射调用影响程序的效率，如果在开发过程中需要使用反射，建议关闭检测已提高效率
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test01();
        test02();
        test03();
    }
}
