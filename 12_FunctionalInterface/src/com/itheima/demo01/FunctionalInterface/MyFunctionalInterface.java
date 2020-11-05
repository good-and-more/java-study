package com.itheima.demo01.FunctionalInterface;
/*
* 函数式接口：有且只有一个抽象方法的接口，称为函数式接口
* 接口中可以包含其他方法（默认，静态，私有）
* */
//注解有什么用，检测接口是否是一个函数式接口，是则编译成功，否则编译失败
@FunctionalInterface
public interface MyFunctionalInterface {
    //定义一个抽象方法
    public abstract void method();
}
