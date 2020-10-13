package com.itheima.demo02.Date;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }

    //返回从0毫秒到现在的毫秒值，相当于System.currentTimeMillis()方法
    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
        //System.out.println(System.currentTimeMillis());
    }

    /*
    * Date类的带参数构造方法
    * Date(long date):传递毫秒值，把毫秒值转换为Date日期*/
    private static void demo02() {
        Date date = new Date(1602592835560L);//long型要在数字末尾加L
        System.out.println(date);
    }

//  Date类的空参数构造方法
//  Date()获取当前系统的日期和时间
    private static void demo01() {
        Date date = new Date();
        System.out.println(date);//说明重写了toString方法 Tue Oct 13 15:46:37 CST 2020
    }
}
