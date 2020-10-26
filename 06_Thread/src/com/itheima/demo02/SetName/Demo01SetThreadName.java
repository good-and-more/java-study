package com.itheima.demo02.SetName;

public class Demo01SetThreadName {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.setName("小强");
//        myThread.start();//得到线程名称小强

//        MyThread myThread = new MyThread("旺财");
//        myThread.start();//获取进程名为旺财

        //模拟秒表
        for(int i = 0;i <= 60;i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);//静态方法可以直接使用
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
