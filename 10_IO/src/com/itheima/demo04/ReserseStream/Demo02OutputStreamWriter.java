package com.itheima.demo04.ReserseStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
*
* */
public class Demo02OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("10_IO/我是UTF-8编码文本.txt"),"gbk");
        osw.write("我是一个程序员");
        osw.flush();
        osw.close();
    }
}
