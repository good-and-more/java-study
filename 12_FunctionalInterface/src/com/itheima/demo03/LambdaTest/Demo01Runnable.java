package com.itheima.demo03.LambdaTest;
/*
*
* */
public class Demo01Runnable {
    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程启动了");
            }
        });

        //方法的参数是一个函数式接口，可以传递lambda表达式
        startThread(()->{
            System.out.println(Thread.currentThread().getName()+"线程启动了");
        });
    }

    public static void startThread(Runnable run) {
        new Thread(run).start();
    }
}
