package com.itheima.demo03.Lambda;

public class Demo01Runnable {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread t = new Thread(run);
        t.start();

        //简化代码，使用匿名内部类实现多线程程序
        Runnable r = new Runnable(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName()+"新线程创建了");
            }
        };
        new Thread(r).start();

        //简化代码
        new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName()+"新线程创建了");
            }
        }).start();
    }
}
