package cn.itcast.day10.demo01;
/*
* 接口当中可以定义成员变量，必须用public static final 三个关键字修饰，相当于常量,final=不可变
* */
public interface MyInterfaceConst {
    //接口中的常量必须赋值，没有默认值
    public static final int NUM = 10;//常量推荐全大写命名
}
