package com.itheima.demo11.Baozi;

public class Baozipu extends Thread{
    //创建包子变量
    private Baozi bz;
    //使用带参数的构造方法，为找个包子变量赋值
    public Baozipu(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run(){
        //定义一个变量
        int count = 0;
        while(true) {//一直生产包子
            //必须使用同步技术保证两个线程同时只有一个在执行
            synchronized (bz) {
                if(bz.isState()) {
                    //有包子，则包子铺调用wait方法进入等待
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后执行，包子铺生产包子，增加一些趣味性，交替生产两种包子
                if(count%2==0) {
                    bz.setPi("薄皮");
                    bz.setXian("三鲜馅");
                }else {
                    bz.setPi("冰皮");
                    bz.setXian("牛肉大葱馅");
                }
                count++;
                System.out.println("包子铺正在生产"+bz.getPi()+bz.getXian()+"包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //包子铺生产好了包子
                bz.setState(true);
                bz.notify();
                System.out.println("包子铺已经生产好了"+bz.getPi()+bz.getXian()+"包子，吃货可以开始吃了");
            }
        }
    }
}
