package com.itheima.demo07.Integer;
/*
* 基本类型与字符串类型之间的相互转换
* 基本类型->字符串
*   1.最简单的,12+""
*   2.包装类的静态方法toString(参数)，不是Object类的toString()方法,名字一样参数列表不同，是重载
*       static String toString(int i)，返回一个表示指定整数的String对象
*   3.String类的静态方法valueOf()
*
* 字符串变为基本类型
* 使用包装类的静态方法parseXXX("数值类型的字符串")
*   Integer类 static int parseInt(String s)
* */
public class Demo03Integer {
    public static void main(String[] args) {
        //基本类型转换为字符串
        int i1 = 123;
        String s1 = i1 + "";
        System.out.println(s1+200);//输出123200，因为s1是字符串，相加是相连

        //用包装类的静态方法转换
        String s2 = Integer.toString(100);
        System.out.println(s2+200);//输出100200

        //用String类的静态方法valueOf()
        String s3 = String.valueOf(100);//返回int参数的字符串表示形式
        System.out.println(s3+200);

        //字符串变为基本类型
        int i = Integer.parseInt(s1);
        System.out.println(i);
    }
}
