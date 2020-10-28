package com.itheima.demo07.Synchronized;
/*
* 实现多线程卖票案例，出现了线程安全问题，卖出了不存在的票和重复的票
* 解决线程安全问题的第一种方案:使用同步代码块
* 格式
*   synchronized(锁对象){
*       可能出现线程安全问题的代码（访问了共享数据的代码）
*   }
* 注意：
*   1.通过代码块中的锁对象，可以使用任意的对象
*   2.必须保证需要同步的多个线程使用的是同一个锁对象
*   3.锁对象作用，把同步代码块锁住，只让一个线程在同步代码块中执行
* */
public class RunnableImpl implements Runnable{
    //定义一个多线程共享的票源
    private int ticket = 100;

    //创建一个锁对象
    Object obj = new Object();
    //设置线程任务：卖票
    @Override
    public void run(){
        //使用死循环让卖票重复执行
        while(true) {
            synchronized (obj) {
                if(ticket>0) {
                    //提高安全问题出现的概率
                    try{
                        Thread.sleep(10);
                    }catch(InterruptedException e){{
                        e.printStackTrace();
                    }}
                    //票存在，卖票，卖完后ticker--
                    System.out.println(Thread.currentThread().getName()+"-->正在卖d第"+ticket+"张票");
                    ticket--;
                }
            }

        }

    }
}
