package com.itheima.demo03.LinkedHashMap;

import java.util.Hashtable;

/*
* java.util.Hashtable<K,V>集合 implements Map<K,V>接口
* Hashtable：底层是一个哈希表，线程安全的集合，单线程集合速度慢，且键值均不得为null
* Hashtable的子类Properties依然活跃，是一个唯一和IO流相结合的集合
* */
public class Demo02Hashtable {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("a", "a");
        //hashtable.put("a", null);//java.lang.NullPointerException 报空指针异常
        System.out.println(hashtable);
    }
}
