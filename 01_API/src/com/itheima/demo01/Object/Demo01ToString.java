package com.itheima.demo01.Object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
* java.lang.Object
* 类Object是类层次结构的根（父）类。
* 每个类都使用Object作为超（父）类。
* 所有对象（包括数组）都实现这个类的方法。
*
* */
public class Demo01ToString {
    public static void main(String[] args) {
        /*
        * Person类默认继承了Object类，可以使用toString方法*/
        Person person = new Person("张三", 18);
        String string = person.toString();
        System.out.println(string);
        System.out.println(person);
//      二者输出一样。直接打印对象的名字，就是调用对象的toString方法
        //类是否重写了toString可以通过打印的方式判断
        Random r = new Random();
        System.out.println(r);

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list);

    }
}
