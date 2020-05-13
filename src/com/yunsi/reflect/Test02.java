package com.yunsi.reflect;

//测试：Class类的创建方式有哪几类
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person=new Student();
        System.out.println("这个人是"+person.name);

        //方式一：通过对象获得
        Class c1=Student.class;
        System.out.println(c1);
        System.out.println(c1.hashCode());

        //方式二：forname获得
        Class c2=Class.forName("com.yunsi.reflect.Student");
        System.out.println(c2);
        System.out.println(c2.hashCode());

        //方式三：通过类名.class获得
        Class c3=Student.class;
        System.out.println(c3);
        System.out.println(c3.hashCode());

        //方式四：基本内置类型的包装类都有一个Type属性
        Class c4=Integer.TYPE;
        System.out.println(c4);

        //获取一个类的父类类型
        Class c5=c1.getSuperclass();
        System.out.println(c5);
    }


}

class Person{
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

}

class Student extends Person{

    public Student() {
        this.name="学生对象";
    }
}

class Teacher extends Person{
    public Teacher(){
        this.name="这个是老师对象";
    }
}
