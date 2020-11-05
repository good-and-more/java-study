package com.itheima.demo04.ReserseStream;

import java.io.FileReader;
import java.io.IOException;

/*
* 会出现乱码，需要OutputStreamWriter和InputStreamReader
* */
public class Demo01FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("10_IO/我是GBK编码文本.txt");
        int len = 0;
        while((len = fr.read()) != -1) {
            System.out.println((char)len);
        }
        fr.close();
    }
}
