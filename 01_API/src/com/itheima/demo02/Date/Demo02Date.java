package com.itheima.demo02.Date;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {

    }

//  Date类的空参数构造方法
//  Date()获取当前系统的日期和时间
    private static void demo01() {
        Date date = new Date();
        System.out.println(date);//说明重写了toString方法 Tue Oct 13 15:46:37 CST 2020
    }
}
