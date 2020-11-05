package com.itheima.demo03.Test;

import java.io.*;
import java.util.HashMap;

/*
*
* */
public class Demo01Test {
    public static void main(String[] args) throws IOException {
        //1.创建一个HashMap集合对象，用来存储每行文本的序号key，每行文本的内容value
        HashMap<String, String> map = new HashMap<>();
        //2.创建字符缓冲输入流对象构造方法中绑定字符输入流
        BufferedReader br = new BufferedReader(new FileReader("10_IO/resource.txt"));
        //3.创建字符缓冲输出流对象构造方法中绑定字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("10_IO/result.txt"));
        //4.使用字符缓冲输入流中的方法readLine逐行读取文本
        String line;
        while((line = br.readLine()) != null) {
            //5.对文本进行切割，获取序号和文本内容，分别存储到HashMap集合中（key是有序的会自动排序）
            String[] arr = line.split("，");
            map.put(arr[0], arr[1]);//
        }
        //6.遍历HashMap
        for (String key : map.keySet()) {
            //7.把每个键值对拼接成一个文本行
            String value = map.get(key);
            line = key+"，"+value;
            //8.把拼接好的文本使用字符缓冲输出流的方法write写入到文件中
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
