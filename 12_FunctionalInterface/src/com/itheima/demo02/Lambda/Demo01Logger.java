package com.itheima.demo02.Lambda;

public class Demo01Logger {
    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";
        showLog(2,msg1+msg2+msg3);
    }

    public static void showLog(int level, String message) {
        if(level == 1) {
            System.out.println(message);
        }
    }
}
