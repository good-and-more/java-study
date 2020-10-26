package com.itheima.demo06.Thread;
/*
* 创建多线程程序的第一种方式：创建Thread类的子类
*
* 实现步骤：
*   1.创建一个Thread类的子类
*   2.在Thread类的子类中重写Thread类中的run方法，设置线程任务
*   3.创建Thread类的子类对象
*   4.调用Thread类的中的方法strat，开启新的线程，执行run方法
*       void start() 使该线程开始执行java虚拟机调用该线程的run方法
*       结果是两个线程并发地运行，当前线程（main线程）和另一个线程（执行run方法的线程）
*       多次启动一个线程是非法的，特别是当线程已经结束执行后，不能再重新启动
* java线程属于抢占式调度
* */
public class Demo01Thread {
    public static void main(String[] args) {
        //3.创建Thread类的子类对象
        MyThread myThread = new MyThread();
        //4.调用Thread类中的方法start方法，执行run方法
        myThread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }

    }
}
