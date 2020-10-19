package com.itheima.demo02.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
* java.util.Set接口 extends Collection接口
* Set接口的特点
*   1.不允许存储重复的元素
*   2.没有索引，没有带索引的方法，也不能用普通的for循环遍历
* java。util。HashSet集合 implements Set接口
* HashSet的特点：
*   1.不允许存储重复的元素
*   2.没有索引，没有带索引的方法，也不能用普通的for循环遍历
*   3.无序集合，存储和取出元素的顺序可能不一致
*   4.底层是一个HashMap 哈希表结构，查询速度非常快
* */
public class Demo01Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(1);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());//1,2,3 重复的1就没存进去
        }
        System.out.println("=========================");
        for (Integer i:set) {
            System.out.println(i);
        }
    }
}
