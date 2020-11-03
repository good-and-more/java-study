package com.itheima.demo02.Recurison;

import java.io.File;

/*
* 递归打印多级目录
* */
public class Demo04Recurison {
    public static void main(String[] args) {
        File file = new File("F:\\java_practise\\java-study\\08_FileANdRecursion");
        getAllFile(file);
    }

    /*
    * 定义一个方法，参数传递File类型的目录，方法中对目录进行遍历
    * */
    public static void getAllFile(File dir) {
        System.out.println(dir);//打印被遍历的目录名称
        File[] files = dir.listFiles();
        for (File file : files) {
            //如果file是文件夹，则递归调用getAllFile方法，继续遍历该文件夹
            if(file.isDirectory()) {
                getAllFile(file);
            }
            System.out.println(file);
        }
    }
}
