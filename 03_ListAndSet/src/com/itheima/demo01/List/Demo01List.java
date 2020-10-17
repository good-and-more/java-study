package com.itheima.demo01.List;

import java.util.ArrayList;
import java.util.List;

/*
* java.util.list接口 extends Collection接口
* List接口的特点
*   1.有序集合，存储取出元素顺序一致
*   2.有索引，包含一些带索引的方法
*   3.允许存储重复的元素
* List接口的特有方法add get remove set
* 注意避免索引越界异常
* */
public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//左接口右实现类，多态
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);

        //在指定的位置上添加指定的元素
        list.add(3,"itheima");
        System.out.println(list);

        System.out.println(list.remove(2));
        System.out.println(list);
        System.out.println(list.set(2,"hello"));
        System.out.println(list);
        System.out.println(list.get(2));
    }
}
