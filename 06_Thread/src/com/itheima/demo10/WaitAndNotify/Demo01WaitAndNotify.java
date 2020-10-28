package com.itheima.demo10.WaitAndNotify;
/*
* 等待唤醒案例：线程之间的通信
*   创建一个顾客线程：告知老板要的包子的种类和数量，调用wait方法进入无限等待
*   创建一个老板线程：花5秒做包子，做好包子后，调用notify方法，唤醒顾客吃包子
* 注意：
*   顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个在执行
*   同步使用的锁对象必须保证唯一
*   只有锁对象才能调用wait和notify方法
* */
public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj = new Object();
        //创建一个顾客线程（消费者）
        new Thread(){
            @Override
            public void run(){
                while(true){
                    synchronized (obj) {
                        System.out.println("告知老板要的包子的种类和数量");
                        //调用wait方法，放弃cpu的执行，进入waitting状态（无限等待）
                        try{
                            obj.wait();
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子已经做好了，开吃");
                        System.out.println("=================");
                    }
                }
            }
        }.start();

        //创建一个老板线程：花5秒做包子，做好包子后，调用notify方法，唤醒顾客吃包子
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
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
