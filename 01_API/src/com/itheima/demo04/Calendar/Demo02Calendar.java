package com.itheima.demo04.Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo02Calendar {
    public static void main(String[] args) {
        //demo01();
        //demo02();
        //demo03();
        demo04();
    }

    private static void demo04() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String day = simpleDateFormat.format(date.getTime());
        System.out.println(day);
    }

    /*
    * public abstract void add(int field, int amount):根据日历的规则，为给定的日历字段增加或减去指定的时间量*/
    private static void demo03() {
        Calendar calendar = Calendar.getInstance();
        //增加2年
        calendar.add(Calendar.YEAR, 2);
        calendar.add(Calendar.YEAR, -5);
        System.out.println(calendar.get(Calendar.YEAR));
    }

    /*
    * public void set(int field, int value):将给定的日历字段设置为给定值
    * 参数：传递指定的日历字段（YEAR,MONTH。。。）
    *       int value：给指定字段设置的值
    * */
    private static void demo02() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,1988);
        calendar.set(Calendar.MONTH,9);
        calendar.set(Calendar.DATE,25);

//      同时设置年月日
        calendar.set(8888,8,8);//方法名一样参数列表不一样，方法的重载
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));

    }

    /*
    * public int get(int field):返回给定的日历字段的值
    * 参数：传递指定的日历字段（YEAR MONTH等，见Calendar类）
    * 返回值：日历字段代表的具体的值*/
    private static void demo01() {
        Calendar calendar = Calendar.getInstance();
        //int year = calendar.get(1);//输出2020
        int year = calendar.get(Calendar.YEAR);
        //Calendar.YEAR是因为，YEAR在Calendar类中是static final修饰的，可以通过类名.静态成员变量的方式直接调用调用
        //同样，静态成员方法也可以通过类名.静态成员方法的方式直接调用
        System.out.println(year);
    }

}
