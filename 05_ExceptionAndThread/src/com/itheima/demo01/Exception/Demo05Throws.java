package com.itheima.demo01.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
* throws关键字，异常处理的第一种方式，交给别人处理
* 当方法内部抛出异常对象时，必须处理
* 可以使用thorws关键字处理异常对象，会把异常声明抛出给方法的调用者，最终交给JVM，中断处理
* 使用格式 在方法声明时使用
*   修饰符 返回值类型 方法名（参数列表） throws AAAException,BBBException...{}
* 注意：1.throws关键字必须写在方法声明处
*       2.throws声明的必须是Exception及其子类
*       3.方法内部如果抛出多个异常，那么throws必须声明多个异常，如果多个异常有子父类关系，那么直接声明父类异常即可
*       4.调用一个声明抛出异常的方法，必须处理声明的异常，要么使用throws继续抛，要么用try。。。catch
* */
public class Demo05Throws {
    //public static void main(String[] args) throws FileNotFoundException,IOException{
    public static void main(String[] args) throws IOException{
        readFile("c:\\a.txt");
        //调用了声明抛出异常的方法，该方法必须处理，要么声明，要么trycatch，这里是主方法调用，主方法throws FileNotFoundException
    }

    /*
    * 定义一个方法，对传递的文件路径进行合法性判断
    * 如果路径不是 c:\\a.txt 那么抛出文件找不到异常对象，告知方法的调用者
    * 注意：
    *   FileNotFoundException是编译异常，必须处理，可以使用throws继续声明抛出
    * */
    public static void readFile(String fileName) throws IOException{
        if (!fileName.equals("c:\\\\a.txt")) {
            throw new FileNotFoundException("传递的文件路径不是：c:\\a.txt");
        }

        /*
        * 如果传递的路径不是.txt结尾，抛出IO异常，告知方法的调用者，文件后缀名不对
        * */
        if(!fileName.endsWith(".txt")) {
            throw new IOException("文件的后缀名不是txt");
        }

    }
}
