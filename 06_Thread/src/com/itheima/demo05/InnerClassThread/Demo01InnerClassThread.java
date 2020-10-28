package com.itheima.demo05.InnerClassThread;
/*
*   匿名内部类的作用，简化代码
*   把子类继承父类，重写父类方法，创建子类对象合成一步写完
* 格式
*   new 父类/接口(){
*       重写父类/接口中的方法
* }
*  */
public class Demo01InnerClassThread {
    public static void main(String[] args) {
        //线程的父类是Thread
        new Thread(){
            //重写run方法设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+i+"黑马");
                }
            }
        }.start();

        //线程接口Runnable,Runnable r = new RunnableImpl();多态写法
        Runnable r = new Runnable(){
            //重写run方法，设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+i+"程序员");
                }
            }
        };
        new Thread(r).start();


        //仍然可以简化
        new Thread(new Runnable(){
            //重写run方法，设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+i+"程序员");
                }
            }
        }).start();
    }
}
