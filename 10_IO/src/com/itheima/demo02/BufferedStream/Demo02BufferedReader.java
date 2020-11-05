package com.itheima.demo02.BufferedStream;

import java.io.*;

/*
* 特有的成员方法 void readLine();
* */
public class Demo02BufferedReader {
    public static void main(String[] args) throws IOException {
        //1.创建FileOutputStream对象构造方法中要输出的目的地
        //2.创建缓冲字节输出流的r对象
        BufferedReader br = new BufferedReader(new FileReader("10_IO\\bw.txt"));
        //3.读取资源
        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        //4.把内部缓冲区的数据刷新到文件中
        br.close();
    }
}
