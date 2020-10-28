package com.itheima.demo07.Synchronized;

/*
* 模拟卖票案例，创建三个线程，同时开启，对共享的票进行出售
* */
public class Demo01Ticket {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        //调用start开启多线程，出现了线程安全问题
        t0.start();
        t1.start();
        t2.start();
    }
}
