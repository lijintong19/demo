package com.yunsi.ThreadTest;

public class ThreadTest1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码"+i);
        }
    }


    public static void main(String[] args) {
        ThreadTest1 threadTest1=new ThreadTest1();
        threadTest1.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("我在学习多线程----------"+i);
        }
    }
}
