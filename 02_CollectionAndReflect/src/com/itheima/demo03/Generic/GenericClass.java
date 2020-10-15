package com.itheima.demo03.Generic;
/*
* 定义一个含有泛型的类，模拟ArrayList集合
* 泛型可以接收任意的数据类型
* 创建对象的时候才确定泛型的数据类型*/
public class GenericClass<E> {
    private E name;

    public GenericClass() {
    }

    public GenericClass(E name) {
        this.name = name;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
