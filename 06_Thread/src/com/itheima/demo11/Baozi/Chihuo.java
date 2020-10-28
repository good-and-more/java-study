package com.itheima.demo11.Baozi;

public class Chihuo extends Thread{
    //创建包子变量
    private Baozi bz;
    //使用带参数的构造方法，为找个包子变量赋值
    public Chihuo(Baozi bz) {
        this.bz = bz;
    }
    @Override
    public void run(){
        while(true) {//一直吃包子
            //必须使用同步技术保证两个线程同时只有一个在执行
            synchronized (bz) {
                if(!bz.isState()) {
                    //无包子，则吃货调用wait方法进入等待
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒之后执行的代码，吃包子
                System.out.println("吃货正在吃"+bz.getPi()+bz.getXian()+"包子");

                //吃货吃完了包子
                bz.setState(false);
                //唤醒包子铺进程
                bz.notify();
                System.out.println("吃货已经把"+bz.getPi()+bz.getXian()+"包子吃完了，包子铺可以开始生产包子了");
                System.out.println("============================");
            }
        }
    }
}
