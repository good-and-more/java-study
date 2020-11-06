package com.itheima.demo05.Consumer;

import java.util.function.Consumer;

/*
*
* */
public class Demo01Cunsoumer {
    //
    public static void method(String name, Consumer<String> consumer){
        consumer.accept(name);
    }

    public static void main(String[] args) {
        method("迪丽热巴",(String name)->{
            //里面对传递的字符串进行消费
            System.out.println(name);
            //消费方式，把字符串进行反转
            StringBuilder reName = new StringBuilder(name).reverse();
            System.out.println(reName);
            String reName1 = new StringBuilder(name).reverse().toString();//StringBuilder这个对象重写了toString方法
            System.out.println(reName1);
        });
    }
}
