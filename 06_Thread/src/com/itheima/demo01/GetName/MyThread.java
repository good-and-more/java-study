package com.itheima.demo01.GetName;

public class MyThread extends Thread{
    @Override
    public void run(){
        //获取线程名称
//        String name = getName();
//        System.out.println(name);

        Thread t = Thread.currentThread();//Thread[Thread-0,5,main]
        System.out.println(t);
        System.out.println(t.getName());//Thread-0
    }
}
