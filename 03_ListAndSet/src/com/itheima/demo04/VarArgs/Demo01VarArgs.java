package com.itheima.demo04.VarArgs;

import java.util.Arrays;

/*
* 当方法的参数列表数据类型确定，但是参数的个数不确定，可以使用可变参数
* 定义方法时使用
*   修饰符 返回值类型 方法名（数据类型...变量名）{}
*   可变参数底层是个数组，传递参数个数可以是0个，1个，2个。。。
*
* 注意事项，一个方法的参数列表只能有一个可变参数
*          如果参数有多个，那么可变参数必须写在参数列表的末尾
* */
public class Demo01VarArgs {
    public static void main(String[] args) {
        //int i = sum();
        int i = sum(10,20,30,40);
        System.out.println(i);
    }

    //定义计算（0-n）个整数的方法
    //已知：计算整数的和，数据类型int
    //未知：参数个数不确定

    public static int sum(int...arr) {
//        System.out.println(arr);
//        System.out.println(arr.length);
//        System.out.println(Arrays.toString(arr));
        int sum = 0;
        //遍历数组
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    //可变参数的终极写法 Object可变，可接收任意数据类型
    public static void method(Object...objects) {

    }
}
