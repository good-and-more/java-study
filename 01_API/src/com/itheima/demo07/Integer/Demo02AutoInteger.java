package com.itheima.demo07.Integer;
/*
* 自动装箱与自动拆箱*/
public class Demo02AutoInteger {
    public static void main(String[] args) {
        /*
        * 自动装箱：直接把int类型的整数赋值给包装类
        * Integer in = 1; 相当于Integer in = new Integer(1)*/
        Integer in = 1;

        /*
        * 自动拆箱:in是包装类，无法直接参与运算，自动拆箱为基本数据类型
        * in+2 相当于in.intvalue() + 2
        * in = 3 又是一个自动装箱
        * */
        in = in + 2;
    }
}
