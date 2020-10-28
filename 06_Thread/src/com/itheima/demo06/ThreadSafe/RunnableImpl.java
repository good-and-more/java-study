package com.itheima.demo06.ThreadSafe;
/*
* 实现多线程卖票案例
* */
public class RunnableImpl implements Runnable{
    //定义一个多线程共享的票源
    private int ticket = 100;

    //设置线程任务：卖票
    @Override
    public void run(){
        while(true) {
            if(ticket>0) {
                //提高安全问题出现的概率
                try{
                    Thread.sleep(10);
                }catch(InterruptedException e){{
                    e.printStackTrace();
                }}
                System.out.println(Thread.currentThread().getName()+"-->正在卖d第"+ticket+"张票");
                ticket--;
            }
        }

    }
}
