package com.itheima.demo02.BufferedStream;

import java.io.*;

/*
* 特有成员方法void newLine()写入一个行分隔符
* */
public class Demo01BufferedWriter {
    public static void main(String[] args) throws IOException {
        //1.创建FileOutputStream对象构造方法中要输出的目的地
        FileWriter fw = new FileWriter("10_IO\\bw.txt");
        //2.创建缓冲字节输出流的对象
        BufferedWriter bw = new BufferedWriter(fw);
        //3.写入资源
        bw.write("中华人民共和国万岁");
        bw.newLine();
        bw.write("世界人民大团结万岁");
        //4.把内部缓冲区的数据刷新到文件中
        bw.flush();
        bw.close();
    }
}
