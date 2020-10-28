package com.itheima.demo09.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* 实现多线程卖票案例，出现了线程安全问题，卖出了不存在的票和重复的票
* 解决线程安全问题的第三种方案:使用Lock锁，最广泛功能最强大
*   lock接口中的方法
*   void lock() 获取锁
*   void unlock() 释放锁
*
* java.util.concurrent.locks.Reentrantlock implements lock接口
* 使用步骤
*   1.在成员位置创建一个Reentrantlock对象
*   2.在可能会出现安全问题的代码前调用lock方法
*   3.在代码后调用unlock方法
* */
public class RunnableImpl implements Runnable{
    //定义一个多线程共享的票源
    private static int ticket = 100;
    //
    Lock lock = new ReentrantLock();

    //设置线程任务：卖票
    @Override
    public void run(){
        System.out.println("this"+this);
        //使用死循环让卖票重复执行
        while(true) {
            lock.lock();
            if(ticket>0) {
                //提高安全问题出现的概率
                try{
                    Thread.sleep(10);
                    //票存在，卖票，卖完后ticker--
                    System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                    ticket--;
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();//无论程序是否异常，都把锁释放
                }
            }
        }
    }
}
