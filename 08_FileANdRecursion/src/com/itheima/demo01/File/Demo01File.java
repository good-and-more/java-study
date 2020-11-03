package com.itheima.demo01.File;

import java.io.File;

/*
* java.io.File类，电脑中的文件和文件夹目录的抽象表达形式
* file:文件
* derectory:文件夹、目录
* path:路径
* */
public class Demo01File {
    public static void main(String[] args) {
        /*
        *
        * */
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//路径分隔符 windows是;号，linux下是:
        String separator = File.separator;
        System.out.println(separator);//文件名称分隔符，windows \反斜杠  linux /正斜杠
    }
}
