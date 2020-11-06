package com.itheima.demo05.Consumer;

import java.util.function.Consumer;

/*
* 连接两个Consumer接口，再进行消费
* con1.andThen(con2).accept(s);谁写前面谁先消费
* */
public class Demo02AndThen {
    public static void method(String s, Consumer<String> con1,Consumer<String> con2) {
//        con1.accept(s);
//        con2.accept(s);
        //可以使用andThen方法连着消费
        con2.andThen(con1).accept(s);
    }

    public static void main(String[] args) {
        method("Hello",(s)->{
            System.out.println(s.toUpperCase());
        },(s)->{
            System.out.println(s.toLowerCase());
        });
    }

}
