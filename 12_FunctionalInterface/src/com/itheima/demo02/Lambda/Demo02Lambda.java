package com.itheima.demo02.Lambda;
/*
* 使用lambda优化日志案例，
* lambda的特点，延迟加载
* lambda的前提，必须使用函数式接口
* */
public class Demo02Lambda {
    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";
        //参数mb是一个函数式接口，所以可以传递Lambda表达式
        showLog(2,()->{
            //返回一个拼接好的字符串
            return msg1+msg2+msg3;
        });
    }

    public static void showLog(int level, MessageBuilder mb) {
        //如果是1级，则调用MessageBuilder接口中的builderMessage方法
        if(level == 1) {
            System.out.println(mb.builderMessage());
        }
    }
}
