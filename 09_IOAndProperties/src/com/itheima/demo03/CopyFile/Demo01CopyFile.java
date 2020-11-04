package com.itheima.demo03.CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        //1.创建一个字节输入流对象，
        FileInputStream fis = new FileInputStream("c:\\1.jpg");
        //2.创建一个字节输出流对象
        FileOutputStream fos = new FileOutputStream("d:\\1.jpg");
        //3.使用字节输入流对象中的方法read读取文件
//        int len = 0;
//        while((len = fis.read()) != -1) {
//            //4.使用字节输出流中的方法write把读取到的字节写入目的地文件中
//            fos.write(len);
//        }

        //使用数组缓冲让一次读取多个字节
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }
        //5.释放资源，先关闭写的再关闭读的
        fos.close();
        fis.close();
    }
}
