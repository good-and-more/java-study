package com.itheima.demo02.Exception;

import java.io.IOException;
/*
* finally不能单独使用，必须跟trycatch一起，一般用于资源释放资源回收，无论程序是否出现异常，都要资源释放
* */
public class Demo02TryCatchFinally {
    public static void main(String[] args) {
        try{
            method("d:\\a.tt");
        }catch(IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("资源释放");
        }
    }

    public static void method(String fileName) throws  IOException{
        if(!fileName.endsWith(".txt")) {
            throw new IOException("文件的后缀名不是txt");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
