package com.itheima.demo05.Writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
* java.io.Writer：字符输出流，是所有字符输出流的最顶层父类，是一个抽象类
* 实现类FileWriter（File file）（String filename）
*
* 字符输出流的使用步骤
* 1.创建FileWriter对象，构造方法中要绑定写入数据的目的地
* 2.使用FileWriter中的方法write，把数据写入到内存缓冲区中（字符转换为字节的过程）
* 3.使用FileWriter中的方法flush，把内存缓冲区中的数据刷新到文件中
* 4.释放资源
* */
public class Demo01Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("09_IOAndProperties\\e.txt");
        //写入单个字符
        fw.write(97);
        fw.flush();
        fw.write(98);
        char[] cs = {'a','b','c','d','e'};
        fw.write(cs);
        fw.write("学习程序员");
        fw.close();

    }
}
