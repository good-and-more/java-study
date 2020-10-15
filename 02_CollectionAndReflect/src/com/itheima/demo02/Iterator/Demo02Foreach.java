package com.itheima.demo02.Iterator;

import java.util.ArrayList;

/*
* 增强for循环，JDK1.5以后专门用来遍历数组和集合的，内部原理是个Iterator
* 使用for循环的格式，简化了迭代器的书写，所有的单列集合都可以使用增强for
* 
* 格式：
*   for(集合、数组的数据类型 变量名：集合名、数组名) {
*       sout（变量名）
*   }
* */
public class Demo02Foreach {
    public static void main(String[] args) {
        //demo01();
        demo02();
    }

    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for (String str:list) {
            System.out.println(str);
        }
    }

    private static void demo01() {
        int[] arr = {1, 2, 3, 4, 5};
        for(int i:arr) {
            System.out.println(i);
        }
    }
}
