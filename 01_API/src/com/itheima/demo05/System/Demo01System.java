package com.itheima.demo05.System;
/*
* System相关的静态方法,类名.方法直接使用*/
public class Demo01System {
    public static void main(String[] args) {
        //demo01();
        demo02();
    }

    /*public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：将数组中指定的数据拷贝到另一个数组中
    src - 源数组。
    srcPos - 源数组中的起始位置。
    dest - 目标数组。
    destPos - 目的地数据中的起始位置。
    length - 要复制的数组元素的数量。 */
    private static void demo02() {
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10};
        //使用arraycopy把源数组前三个元素复制到目标数组上的前三个位置
        System.arraycopy(src,0,dest,0,3);
        System.out.println(dest);

    }

    /*
    * public static long currentTimeMillis()
    * 用来验证程序的效率*/
    private static void demo01() {
//      程序执行前取一次毫秒值
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
//      程序结束后取一次毫秒值
        long end = System.currentTimeMillis();
        System.out.println("程序执行耗时："+(end-start)+"毫秒");
    }

}
