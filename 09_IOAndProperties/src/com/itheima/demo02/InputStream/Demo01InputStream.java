package com.itheima.demo02.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
* 输入流
* 读取数据的原理（从硬盘读取到内存中）
* */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("09_IOAndProperties\\b.txt");
//        int len = fileInputStream.read();
//        System.out.println(len);
//        len = fileInputStream.read();
//        System.out.println(len);
//        len = fileInputStream.read();
//        System.out.println(len);

        int len = 0;
        while((len = fileInputStream.read()) != -1) {
            System.out.println(len);
        }

        fileInputStream.close();
    }
}
