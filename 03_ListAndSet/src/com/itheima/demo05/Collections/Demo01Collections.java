package com.itheima.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
* java.util.Collections是集合工具类，Collection接口的实现类，工具类里面一般都是静态方法，方便使用
*
* */
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a","b","c","d","e");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
