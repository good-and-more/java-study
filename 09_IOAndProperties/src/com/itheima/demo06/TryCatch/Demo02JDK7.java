package com.itheima.demo06.TryCatch;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
/*
* jdk7的新特性，在try后增加一个（），定义流对象，在try中有效
* 流对象使用完毕后自动释放
* */
public class Demo02JDK7 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("c:\\1.jpg");
            FileOutputStream fos = new FileOutputStream("d:\\1.jpg");) {
            int len = 0;
            while((len = fis.read()) != -1) {
                //4.使用字节输出流中的方法write把读取到的字节写入目的地文件中
                fos.write(len);
            }
        }catch(IOException e) {
            System.out.println(e);
        }
    }
}
