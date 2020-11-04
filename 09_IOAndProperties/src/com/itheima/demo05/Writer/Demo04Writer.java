package com.itheima.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo04Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("09_IOAndProperties\\f.txt", true);
        for (int i = 0; i < 5; i++) {
            fw.write("helloworld"+i+"\r\n");
        }
        fw.close();
    }
}
