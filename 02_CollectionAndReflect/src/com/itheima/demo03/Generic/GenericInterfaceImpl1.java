package com.itheima.demo03.Generic;
/*
* 含有泛型的接口，第一种使用方式，通过实现类来使用接口，实现的时候要指定接口的数据类型*/
public class GenericInterfaceImpl1 implements GenericInterface<String>{
    //覆盖重写接口中的抽象方法
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
