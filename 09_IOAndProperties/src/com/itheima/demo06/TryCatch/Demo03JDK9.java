package com.itheima.demo06.TryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* try的前面可以定义流对象，在try后的括号中引入流对象的名称
* */
public class Demo03JDK9 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("c:\\1.jpg");//创建对象本身有异常，跟jdk7的区别就是要throws
        FileOutputStream fos = new FileOutputStream("d:\\1.jpg");
        try(fis;fos) {
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
