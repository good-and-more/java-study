package com.itheima.demo01.File;

import java.io.File;
import java.io.IOException;

public class Demo05FileCreate {
    public static void main(String[] args) throws IOException {
        show01();
    }

    /*
    * public boolean createNewFile():当且仅当该名称的文件不存在时，创建一个新的空文件夹
    * 创建文件的路径和名称在构造方法中给出
    * 只能创建文件，不能创建文件夹
    * */
    private static void show01() throws IOException {
        File f1 = new File("F:\\java_practise\\java-study\\08_FileANdRecursion\\a.txt");
        f1.createNewFile();
        File f2 = new File("08_FileANdRecursion\\b.txt");
        f2.createNewFile();
        f1.delete();
        File f3 = new File("F:\\java_practise\\java-study\\08_FileANdRecursio\\a.txt");
        f3.mkdir();
        File f4 = new File("F:\\java_practise\\java-study\\08_FileANdRecursio\\a.txt");
        f4.mkdirs();
    }
}
