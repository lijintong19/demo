package com.yunsi.reflect;

//什么叫反射
public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
       Class c1= Class.forName("com.yunsi.reflect.User");
        System.out.println(c1);
        Class c2=Class.forName("com.yunsi.reflect.User");

        System.out.println(c2.hashCode());
        System.out.println(c1.hashCode());
    }

}

class User{
    private String name;
    private int age;
    private String address;

    public User() {
    }

    public User(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
