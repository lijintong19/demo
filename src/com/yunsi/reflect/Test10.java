package com.yunsi.reflect;

import java.lang.annotation.*;
import java.lang.reflect.Field;

//通过反射操作注解
public class Test10 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("com.yunsi.reflect.Student2");

        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        System.out.println("=======================================================");
        //获得注解的value的值
        Tableli tableli= (Tableli) c1.getAnnotation(Tableli.class);//获取指定注解
        String value = tableli.value();//获取注解的value
        System.out.println(value);
        System.out.println("=======================================================");
        //获得类指定的注解
        Field f = c1.getDeclaredField("name");
        Fielli annotation = f.getAnnotation(Fielli.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.length());
        System.out.println(annotation.type());

    }
}

@Tableli("db_student")
class Student2{
    @Fielli(columnName = "db_id",type = "int",length = 10)
    private int id;
    @Fielli(columnName = "db_age",type = "int",length = 10)
    private int age;
    @Fielli(columnName = "db_name",type = "varchar",length = 3)
    private String name;

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Tableli{
    String value();
}

//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Fielli{
    String columnName();
    String type();
    int length();
}


