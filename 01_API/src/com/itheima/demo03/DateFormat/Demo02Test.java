package com.itheima.demo03.DateFormat;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
* 通过时间相关的api，计算一个人出生了多少天*/
public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        /*
        * 1.获取现在的毫秒数
        * 2.获取出生日期，转换为毫秒数
        * 3.二者相减，计算天数
        * */
        long currentTime = new Date().getTime();

        //使用Scanner类中的方法next获取出生日期字符串
        System.out.println("请输入这个人的生日，格式是yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        String birthDay = sc.next();
        //获取出生日期，转换为毫秒数
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate = simpleDateFormat.parse(birthDay);
        //把Date格式的出生日期转换为毫秒值
        long birthdayDateTime = birthDate.getTime();
        long time = (currentTime - birthdayDateTime);
        //毫秒的差值转换为天
        long day =  (time/1000/3600/24);
        System.out.println("这个人出生到现在已经"+day+"天了");

    }
}
