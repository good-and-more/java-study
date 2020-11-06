package com.itheima.demo04.MethodReference;

public class Demo01Printable {
    //定义一个方法，参数传递Printable接口
    public static void printString(Printable p){
        p.print("helloworld");
    }

    public static void main(String[] args) {
        printString((s)->{
            System.out.println(s);
        });

        printString(System.out::println);
    }
}
