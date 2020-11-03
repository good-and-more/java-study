package com.itheima.demo01.File;

import java.io.File;

/*
* 文件夹遍历函数
* public String[] list() : 返回一个String数组，表示该File目录中的所有子文件或目录
* public File[] listFiles(): 返回一个File数组，表示该File目录中的所有子文件或目录
*
* 注意：这两个方法遍历的是构造方法中给出的目录
* 如果构造方法中给出的路径不存在或不是一个目录，会抛出空指针异常
* */
public class Demo06FileListAndListFiles {
    public static void main(String[] args) {
        //show01();
        show02();
    }

    private static void show02() {
        File f2 = new File("08_FileANdRecursion");
        File[] arr = f2.listFiles();
        for (File file : arr) {
            System.out.println(file.getName());
        }
    }

    private static void show01() {
        File f1 = new File("08_FileANdRecursion");
        String[] arr = f1.list();
        for (String fileName : arr) {
            System.out.println(fileName);
        }
    }
}
