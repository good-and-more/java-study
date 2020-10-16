package com.itheima.demo03.Generic;
/*
* 含有泛型的接口第二种使用方式：接口使用什么泛型，实现类就使用什么泛型，类跟着接口走
* 跟第一种的区别就是，实现类不明确指定泛型用什么数据类型，而是一起用<E>，等new实现类的时候再指定
* */
public class GenericInterfaceImpl2<I> implements GenericInterface<I>{
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
