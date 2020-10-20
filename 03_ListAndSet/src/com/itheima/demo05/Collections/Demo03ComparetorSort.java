package com.itheima.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo03ComparetorSort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01, 1, 3, 2);
        System.out.println(list01);

        Collections.sort(list01, new Comparator<Integer>() {//匿名对象+匿名内部类
            //重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(list01);
    }
}
