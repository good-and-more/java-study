package com.itheima.demo02.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
* LinkedHashSet集合特点，底层是哈希表加链表，多了一条链表保证元素有序
* */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("p1");

        set.add("p3");
        set.add("pp");
        set.add("p2");
        System.out.println(set);

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("p1");

        linked.add("p3");
        linked.add("p3");
        linked.add("p2");
        System.out.println(linked);
    }
}
