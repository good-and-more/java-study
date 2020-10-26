package com.itheima.demo01.GetName;
/*
* 主线程:main
* 新线程Thread-0 Thread-1
* */
public class Demo01GetThreadName {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        System.out.println(Thread.currentThread().getName());
    }
}
