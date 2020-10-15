package com.itheima.demo03.Generic;

public class Demo02GenericClass {
    public static void main(String[] args) {
        GenericClass gc = new GenericClass();
        gc.setName("只能是字符串");
        Object obj = gc.getName();
        System.out.println(obj);

        //使用泛型
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(2);

        //Integer name = gc2.getName();
        int name = gc2.getName();//自动拆箱
        System.out.println(name);
    }
}
