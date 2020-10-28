package com.itheima.demo10.WaitAndNotify;
/*
* 进入TimeWaiting有两种方式
* 1.使用sleep(long m)方法，在m毫秒结束之后，线程睡醒进入Runnable/Blocked状态
* 2.使用wait(long m)方法，在m毫秒值之后，还没有被notify唤醒，就会自动醒来，线程睡醒进入Runnable/Blocked状态
*
* 唤醒的方法
* 1.notify 唤醒此对象监视器上的单个线程
* 2.notifyAll 唤醒此对象监视器上等待的所有线程
* */
public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj = new Object();
        //创建一个顾客线程（消费者）
        new Thread(){
            @Override
            public void run(){
                while(true){
                    synchronized (obj) {
                        System.out.println("顾客1告知老板要的包子的种类和数量");
                        //调用wait方法，放弃cpu的执行，进入waitting状态（无限等待）
                        try{
                            obj.wait(5000);
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子已经做好了，顾客1开吃");
                        System.out.println("=================");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                while(true){
                    synchronized (obj) {
                        System.out.println("顾客2告知老板要的包子的种类和数量");
                        //调用wait方法，放弃cpu的执行，进入waitting状态（无限等待）
                        try{
                            obj.wait(5000);
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子已经做好了，顾客2开吃");
                        System.out.println("=================");
                    }
                }
            }
        }.start();


        new Thread(){
            @Override
            public void run(){
                while(true) {
                    //花5000毫秒做包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("老板5秒钟之后做好了包子，告知顾客");
                        //做好包子之后，调用notify方法，唤醒顾客吃包子
                        //obj.notify();如果有多个等待线程，随机唤醒一个
                        obj.notifyAll();
                    }
                }
            }
        }.start();
    }

}
