package com.yunsi.ThreadTest;

public class ThreadTest2 implements Runnable {
    //通过实现runnable接口可以避免继承Thread类的单继承的局限性。实现接口更加灵活。，开启一个对象，可以创建多个线程。
    private static int ticket=10;
    @Override
    public void run() {
        while (true){
            if (ticket<=0){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"这是第"+ticket+"张票");
            ticket--;
        }
    }

    public static void main(String[] args) {
        ThreadTest2 thread=new ThreadTest2();

        //传入目标对象+Thread()对象.start()
        new Thread(thread,"线程一").start();
        new Thread(thread,"线程二").start();
    }
}
