package com.itheima.demo05.Debug;
/*
* Debug调试程序，可以让代码逐行执行，调试过程中出现的bug
*
* 使用方法
*   在行号的右边，添加断点，右键选择Debug执行
* */
public class Demo01Debug {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int c = 30;
//        int sum = a+b+c;
//        System.out.println(sum);
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
        print();

    }

    private static void print() {
        System.out.println("helloworld");
        System.out.println("helloworld2");
        System.out.println("helloworld3");
        System.out.println("helloworld4");
    }


}
