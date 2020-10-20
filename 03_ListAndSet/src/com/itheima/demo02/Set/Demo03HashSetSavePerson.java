package com.itheima.demo02.Set;

import java.util.HashSet;

/*
* HashSet存储自定义类型元素
* set集合报错元素唯一：
*   存储的元素（String，Integer。。。Student，Person）必须重写hashCode和equals方法，基本元素
* 要求，同名同年龄的人，视为同一个人，只能存储一次
*
* */
public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        //创建一个HashSet集合存储Person
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("小明", 18);
        Person p2 = new Person("小明", 18);
        Person p3 = new Person("小明", 19);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1==p2);//重写了equals方法和hashCode方法，两个参数相同的对象获得了同一个hashCode，但是两个对量地址值不同
        System.out.println(p1.equals(p2));
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
