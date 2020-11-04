package com.itheima.demo04.ReadChinese;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
* int read()
* int read(char[] cbuf)一次读取多个字符，将字符放入数组
* void close()
* */
public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("09_IOAndProperties/c.txt");
//        int len = fr.read();
//        while((len = fr.read())!= -1) {
//            System.out.println((char) len);
//        }

        char[] cs = new char[1024];
        int len = 0;
        while((len = fr.read(cs)) != -1) {
            System.out.println(new String(cs,0,len));
        }
        fr.close();
    }


}
