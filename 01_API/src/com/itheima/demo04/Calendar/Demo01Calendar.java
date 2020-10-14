package com.itheima.demo04.Calendar;

import java.util.Calendar;

/*
* java.util.Calendar类：日历类
* 一个抽象类，提供了很多操作日历字段的方法
* Calendar类无法直接创建对象使用，里面有一个静态方法叫getInstance()，该方法返回了Calendar类的子类对象
* static Calendar getInstance()使用默认时区和语言环境获得一个日历
* */
public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();//左父右子，多态
        System.out.println(calendar);
    }
}
