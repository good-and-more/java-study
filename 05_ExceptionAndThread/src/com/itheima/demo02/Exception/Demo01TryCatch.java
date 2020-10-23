package com.itheima.demo02.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
* try...catch:异常处理的第二种方式，自己处理异常
* 格式
*   try{
*       可能产生异常的代码
*   }catch(定义一个异常的变量，用来接收try中抛出的异常对象){
*       异常的处理逻辑，一般在工作中会把异常信息记录到一个日志中
*   }...catch(异常类名 变量名){}
*   ...catch(异常类名 变量名){}
*
*
* */
public class Demo01TryCatch {
    public static void main(String[] args) {
        try{
            readFile("c:\\a.tt");
            System.out.println("资源释放");
        }catch(IOException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("后续代码");

        //调用了声明抛出异常的方法，该方法必须处理，要么声明，要么trycatch，这里是主方法调用，主方法throws FileNotFoundException
    }

    /*
     * 定义一个方法，对传递的文件路径进行合法性判断
     * 如果路径不是 c:\\a.txt 那么抛出文件找不到异常对象，告知方法的调用者
     * 注意：
     *   FileNotFoundException是编译异常，必须处理，可以使用throws继续声明抛出
     * */
    public static void readFile(String fileName) throws IOException{
        /*
         * 如果传递的路径不是.txt结尾，抛出IO异常，告知方法的调用者，文件后缀名不对
         * */
        if(!fileName.endsWith(".txt")) {
            throw new IOException("文件的后缀名不是txt");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
