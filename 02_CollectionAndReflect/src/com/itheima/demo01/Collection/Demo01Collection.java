package com.itheima.demo01.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
* java.util.Collection接口
*   所有单列集合的最顶层的接口，定义了所有单列集合的共性方法
*   共性的方法常用的如下：
* public boolean add（E e）：把给定的对象添加到当前集合中
* public boolean remove（E e）: 把给定的对象在当前集合中删除
* */
public class Demo01Collection {
    public static void main(String[] args) {
        //创建集合对象，可以使用多态，接口指向对应的实现类
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);//重写了toString方法

        //public boolean add（E e）：把给定的对象添加到当前集合中，返回值是一个boolean值
        boolean b1 = coll.add("张三");
        System.out.println("b1:" + b1);
        System.out.println(coll);
        coll.add("李四");
        coll.add("赵六");
        coll.add("田七");
        System.out.println(coll);

        /*
        * public boolean remove（E e）: 把给定的对象在当前集合中删除
        * */
        coll.remove("赵六");
        coll.remove("王五");

        /*
        * public boolean contains(E e):判断当前集合中是否包含给定的对象
        * */
        System.out.println("集合中是否包含赵六"+coll.contains("赵六"));
        System.out.println("集合中是否包含张三"+coll.contains("张三"));
    }

}