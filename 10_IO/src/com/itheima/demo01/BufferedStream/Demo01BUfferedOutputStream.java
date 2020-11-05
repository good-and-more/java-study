package com.itheima.demo01.BufferedStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* java.io.BufferedOutputStream extends OutputStream
* */
public class Demo01BUfferedOutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建FileOutputStream对象构造方法中要输出的目的地
        FileOutputStream fos = new FileOutputStream("10_IO\\a.txt");
        //2.创建缓冲字节输出流的对象
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] bytes = {97, 98, 99};
        //3.写入资源
        bos.write(bytes);
        //4.把内部缓冲区的数据刷新到文件中
        bos.flush();
        bos.close();
    }
}
