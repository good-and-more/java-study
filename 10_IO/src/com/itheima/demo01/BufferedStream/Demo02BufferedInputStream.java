package com.itheima.demo01.BufferedStream;

import java.io.*;

public class Demo02BufferedInputStream {
    public static void main(String[] args) throws IOException {
        //1.创建FileOutputStream对象构造方法中要输出的目的地
        FileInputStream fis = new FileInputStream("10_IO\\a.txt");
        //2.创建缓冲字节输出流的对象
        BufferedInputStream bis = new BufferedInputStream(fis);
        //3.读取资源
        int len = 0;
        while((len = bis.read()) != -1) {
            System.out.println(len);
        }
        //4.把内部缓冲区的数据刷新到文件中
        bis.close();
    }
}
