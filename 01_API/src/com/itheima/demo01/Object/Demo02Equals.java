package com.itheima.demo01.Object;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Demo02Equals {
    public static void main(String[] args) {
        /*
        * boolean equals(Object obj) 指示其他某个对象是否与此对象相等
        * equals方法源码：
        * */
        Person p1 = new Person("迪丽热巴",18);
        Person p2 = new Person("古力娜扎",19);
        //boolean b = p1.equals(p2);
        //System.out.println(b);
        //p1 = p2;
        //b = p1.equals(p2);
        //System.out.println(b);
        ArrayList<String> list = new ArrayList();//强制转换不做判断，会出现类型转换异常
        boolean b = p1.equals(list);
        System.out.println(b);

    }
}
