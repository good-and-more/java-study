package com.itheima.demo01.OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 追加写、续写的两个构造方法
* FileOutputStream(String name,boolean append) 创建一个向具有指定name的文件中写入数据的输出流
* FileOutputStream(File file,boolean append) 创建一个向指定File对象的文件中写入数据的输出流
* */
public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File("09_IOAndProperties\\b.txt"),true);
        byte[] bytes = {77,78,79};
        fileOutputStream.write(bytes);
        for (int i = 0; i < 10; i++) {
            fileOutputStream.write("你好".getBytes());
            fileOutputStream.write("\r\n".getBytes());
        }
        fileOutputStream.close();
    }
}
