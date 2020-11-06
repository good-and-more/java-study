package com.itheima.demo04.Supplier;

import java.util.function.Supplier;

/*
*
* */
public class Demo02Test {
    //定义一个方法，用于获取int类型数组中元素的最大值，方法的参数传递Supplier接口，泛型使用Integer
    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        //定义一个int类型的数组
        int[] arr = {100, 0, -50, 88, 99, 33, -30};
        //调用getMax方法，没有参数传递，是指需要重写的sup.get()方法没有参数，所以lambda表达式前面的括号没有参数
        int result = getMax(()->{
            //获取数组的最大值并返回
            //定义一个变量
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            return max;
        });

        System.out.println(result);
    }
}
