package com.itheima.demo11.Baozi;

public class Demo01Chibaozi {
    public static void main(String[] args) {
        Baozi bz = new Baozi();
        //创建包子铺进程，生产包子
        new Baozipu(bz).start();
        new Chihuo(bz).start();
    }
}
