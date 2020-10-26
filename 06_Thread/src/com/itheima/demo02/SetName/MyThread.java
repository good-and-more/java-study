package com.itheima.demo02.SetName;
/*
* 1.使用Thread类中的方法setName()
* 2.创建一个带参数的构造方法，参数传递线程的名称，调用父类的带参数构造方法，把线程传递给父类，让它给子线程起名字
*   Thread(String name)分配新的Thread对象
* */
public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);//把线程名称传递给父类的带参构造方法，让父类（Thread）给子线程起一个名字
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
