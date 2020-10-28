package com.itheima.demo04.Runable;
/*
* 创建多线程程序的第二种方法
* java.lang.Runnable
*   Runnable 接口应该由那些打算通过某一线程执行其实例的类来实现。类必须定义一个称为run的无参数方法
* java.lang.Thread类的构造方法，可以传递Runnable接口的实现类对象
*
* 实现步骤：
*   1.创建一个Runnable接口的实现类
*   2.在实现类中重写Runnable接口的run方法，设置线程任务
*   3.创建一个Runnable的实现类对象
*   4.
* */
public class Demo01Runnable {
    public static void main(String[] args) {
        //3.创建一个Runnable的实现类对象
        RunnableImpl run = new RunnableImpl();
        //4.创建Thread类对象，向构造方法中传入Runnable的实现类对象
        Thread thread = new Thread(run);
        //5.调用Thread类中的start方法，开启新线程执行run方法
        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }

        //再用第一种方法创建一个线程，创建一个Thread类的子类，重写run方法，创建该子类的对象，执行start方法
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
