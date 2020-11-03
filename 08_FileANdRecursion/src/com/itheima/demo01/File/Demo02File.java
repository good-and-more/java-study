package com.itheima.demo01.File;

import java.io.File;

/*
* 绝对路径：完整路径 以盘符开始完整路径
* 相对路径：简化路径 相对当前项目的根目录
* */
public class Demo02File {
    public static void main(String[] args) {
        show01();
        show02("c:\\","a,txt");
        show03();
    }

    private static void show03() {
        //File(File parent,String child)根据parent抽象路径名和child子路径字符串创建一个新的File实例
        File parent = new File("c:\\");
        File file = new File(parent,"hello.java");
        System.out.println(file);
    }

    private static void show02(String parent,String child) {
        //File(String parent,String child)根据父路径字符串和子路径字符串创建一个新的File实例
        File file = new File(parent, child);
        System.out.println(file);
    }

    private static void show01() {
        File f1 = new File("F:\\java_practise\\java-study\\a.txt");
        System.out.println(f1);//重写了toString方法
        File f2 = new File("F:\\java_practise\\java-study");
        System.out.println(f2);//重写了toString方法
        File f3 = new File("b.txt");
        System.out.println(f3);//重写了toString方法
    }
}
