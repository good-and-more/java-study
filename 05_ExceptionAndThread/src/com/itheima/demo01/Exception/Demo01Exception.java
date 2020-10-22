package com.itheima.demo01.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Exception {
    public static void main(String[] args) /*throws ParseException*/ {
        //编译期异常，进行编译（写代码）的时候java程序出现异常
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = null;
//        try {
//            date = sdf.parse("1999-0909");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println(date);
//        System.out.println("后续代码");

        //RuntimeException：运行期异常，java程序运行过程中出现的异常
//        int[] arr = {1, 2, 3};
//        //System.out.println(arr[0]);
//        try {
//            System.out.println(arr[3]);
//        }catch(Exception e) {
//            System.out.println(e);
//        };
//        System.out.println("后续代码");

        int[] arr = new int[1024 * 1024 * 1024];//OutOfMemoryError: Java heap space error必须处理，不然程序无法运行

    }
}
