package com.itheima.demo03.Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/*
* 使用过滤器实现查找文件
* java.io.FileFilter接口：用于抽象路径名（File对象）的过滤器
* 作用：用来过滤文件（File对象）
* 抽象方法：用来过滤文件的方法
*       boolean accept(File pathname)测试指定抽象路径名是否包含在某个路径名列表中
*       参数：
*           File pathname：使用ListFiles方法遍历目录，得到的每一个文件对象
* 注意：两个过滤器接口是没有实现类的，需要自己写实现类，重写过滤的方法
* */
public class Demo01Filter {
    public static void main(String[] args) {
        File file = new File("F:\\java_practise\\java-study\\08_FileANdRecursion");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
        //File[] files = dir.listFiles(new FileFilterImpl());
//        File[] files = dir.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
//            }
//        });
//        File[] files = dir.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java");
//            }
//        });
        //使用lambda表达式
//        File[] files = dir.listFiles((File d, String name)->{
//            return new File(d,name).isDirectory() || name.toLowerCase().endsWith(".java");
//        });

        File[] files = dir.listFiles((pathname)->pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java"));
        for (File file : files) {
            if(file.isDirectory()) {
                getAllFile(file);
            }else {
                System.out.println(file);
            }
        }
    }
}
