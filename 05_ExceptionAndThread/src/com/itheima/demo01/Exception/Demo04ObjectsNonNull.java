package com.itheima.demo01.Exception;

import java.util.Objects;

/*
* 判断参数合法性，是否为空， 有Objects类的静态方法使用
* */
public class Demo04ObjectsNonNull {
    public static void main(String[] args) {
        isNull("123");
    }

    public static void isNull(Object obj) {
//        if(obj == null) {
//            throw new NullPointerException("传递的对象值是null");
//        }
        Objects.requireNonNull(obj);

    }
}
