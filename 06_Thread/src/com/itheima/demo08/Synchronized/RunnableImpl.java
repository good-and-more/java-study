package com.itheima.demo08.Synchronized;
/*
* 实现多线程卖票案例，出现了线程安全问题，卖出了不存在的票和重复的票
* 解决线程安全问题的第二种方案:使用同步方法
* 1.把访问了共享数据的代码抽取出来形成一个方法
* 2.在方法上加synchronized修饰符
* */
public class RunnableImpl implements Runnable{
    //定义一个多线程共享的票源
    private static int ticket = 100;

    //创建一个锁对象
    Object obj = new Object();
    //设置线程任务：卖票
    @Override
    public void run(){
        System.out.println("this"+this);
        //使用死循环让卖票重复执行
        while(true) {
            //payTicket();
            payTicketStatic();
        }
    }
/*
* 静态的同步方法，锁对象不能是this，this是创建对象之后产生的，静态方法优先于对象
* 静态方法的锁对象是本类的class属性-->class文件对象（反射）
* */
    public static /*synchronized*/ void payTicketStatic(){
        synchronized (RunnableImpl.class) {
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
    /*
    * 定义一个同步方法
    * 同步方法的锁对象就是实现类对象new RunnableImpl()，也就是this
    * */
    public synchronized void payTicket(){
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
