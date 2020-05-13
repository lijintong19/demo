package com.yunsi.LambdaTest;

public class Test1 {
    public static void main(String[] args) {
        //接口引用指向具体的实现类
        Ilike ilike=new Test2();
        ilike = ()->{
            System.out.println("我在练习lambda表达式1");
        };
        ilike.ni();

        System.out.println("-----------------------");

        Ilike ilike1=new Ilike() {
            @Override
            public void ni() {
                System.out.println("我在练习匿名内部类");
            }
        };

        ilike1.ni();
    }
}

/*一个接口中只有一个抽象方法的话，这个接口叫做函数式接口*/
interface Ilike {
    void ni();
}

class Test2 implements Ilike{
    @Override
    public void ni() {

    }
    /*@Override
    public void ni() {
        System.out.println("我在联系lambda表达式");
    }*/
}
