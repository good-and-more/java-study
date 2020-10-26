package com.itheima.demo05.Thread;
/*
*   主线程：执行main方法的线程
*   单线程程序：java程序中只有一个线程，执行从main方法开始从上到下依次执行
*   JVM中执行main方法，main方法会进入栈内存
*/
public class Demo01MainThread {
    public static void main(String[] args) {
        Person a = new Person("小强");
        a.run();
        Person b = new Person("旺财");
        b.run();
    }
}
