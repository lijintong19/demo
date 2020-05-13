package com.yunsi.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

//通过反射来获取泛型
public class Test09 {

    public void test01(Map<String,User> map, List<User> list){
        System.out.println("test01");
    }

    public Map<String,User> test02(){
        System.out.println("test02");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Test09 test09=new Test09();
        Method method = test09.getClass().getMethod("test01", Map.class, List.class);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
       //获取了Test01()中的两个参数的类型，没有取到里面的东西
        for (Type genericParameterType : genericParameterTypes) {
            System.out.println(genericParameterType);
            //取到内部的信息
            if (genericParameterType instanceof ParameterizedType){
                Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println(actualTypeArgument);
                }
            }
        }

        Method method1 = test09.getClass().getMethod("test02", null);
        Type returnType = method1.getGenericReturnType();

        if (returnType instanceof ParameterizedType){
            Type[] actualTypeArguments = ((ParameterizedType) returnType).getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println(actualTypeArgument);
            }
        }
    }
}
