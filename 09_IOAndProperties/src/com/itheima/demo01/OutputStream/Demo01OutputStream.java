package com.itheima.demo01.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
* 以FileOutputStream extends Outputstream举例
* 文件字节输出流，把内存中数据写入到硬盘中
*
* 字节输出流的使用步骤
* 1.创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
* 2.调用FileOutputStream对象的方法write，把数据写入到文件中
* 3.释放资源（流使用会占用一定内存，使用完毕要把内存清空）
* */
public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("09_IOAndProperties\\a.txt");
        fileOutputStream.write(97);
        fileOutputStream.close();
    }
}
