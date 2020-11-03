package com.itheima.demo02.InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("09_IOAndProperties\\a.txt");
        byte[] bytes = new byte[2];//字节数组包含两个元素，所以输入流只能读取两个元素，abc只能读取ab
        int len = fileInputStream.read(bytes);
        System.out.println(len);
        //System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));

        len = fileInputStream.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));

        len = fileInputStream.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));
        //释放资源
        fileInputStream.close();
    }
}
