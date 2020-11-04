package com.itheima.demo06.TryCatch;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01TryCatch {
    public static void main(String[] args) {
        FileWriter fw = null;//提高了fw的作用域，变量在定义的时候可以没有值，但是使用的时候必须有值
        //如果new FileWriter创建失败，fw就没有值，会报错
        try{
            fw = new FileWriter("w:\\09_IOAndProperties\\f.txt", true);
            for (int i = 0; i < 5; i++) {
                fw.write("helloworld"+i+"\r\n");
            }
        }catch(IOException e) {
            System.out.println(e);
        }finally {
            //如果创建对象失败了，fw默认值是null，不能调用close();需要增加一个判断
            if(fw != null) {
                try {
                    fw.close();
                }catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
