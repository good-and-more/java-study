package com.itheima.demo01.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
* public void write(byte[] b)将b.length字节从指定的字节数组写入输出流
* public void write(byte[] b,int off,int len)从指定的字节数组写入len字节，从偏移量off开始输出到此输出流
* */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("09_IOAndProperties\\b.txt");
        //在文件中显示100，需要输出三个字节
        fileOutputStream.write(49);
        fileOutputStream.write(48);
        fileOutputStream.write(48);

        byte[] bytes = {65, 66, 67, 68, 69};
        fileOutputStream.write(bytes);
        fileOutputStream.write(bytes,1,2);
        byte[] byte2 = "你好".getBytes();
        fileOutputStream.write(byte2);

        //释放资源
        fileOutputStream.close();
    }
}
