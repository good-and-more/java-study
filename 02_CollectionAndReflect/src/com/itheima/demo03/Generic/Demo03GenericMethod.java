package com.itheima.demo03.Generic;

public class Demo03GenericMethod {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        /*
        * 调用含有泛型的方法method01，传递什么类型，泛型就是什么类型
        * */
        gm.method01(10);
        gm.method01("abc");

        gm.method02("123");//静态方法不建议创建对象使用

        GenericMethod.method02("bbb");
        GenericMethod.method02(123);
        GenericMethod.method02(2.2);
    }
}
