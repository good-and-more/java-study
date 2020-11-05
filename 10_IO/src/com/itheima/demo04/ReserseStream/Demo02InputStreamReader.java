package com.itheima.demo04.ReserseStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo02InputStreamReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("10_IO/我是GBK编码文本.txt"),"gbk");
        int len = 0;
        while((len = isr.read()) != -1) {
            System.out.println((char)len);
        }
        isr.close();
    }
}
