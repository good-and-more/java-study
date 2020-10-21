package com.itheima.demo03.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
* java.util.LinkedHashMap<K,V> extends HashMap<K,V>
* Map接口的哈希表和链表列表实现，具有可预知的迭代顺序
* 底层原理：
*   哈希表+链表(链表用来记录元素顺序)
*
* */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("c", "c");
        map.put("b", "b");
        map.put("a", "d");
        System.out.println(map);//key不允许重复，HashMap 存取顺序不一致

        LinkedHashMap<String, String> linked = new LinkedHashMap<>();
        linked.put("a", "a");
        linked.put("c", "c");
        linked.put("b", "b");
        linked.put("a", "d");
        System.out.println(linked);//有序
    }
}
