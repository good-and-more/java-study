package com.itheima.demo06.StringBuilder;
/*
* */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
        StringBuilder bu = new StringBuilder();
//        StringBuilder bu2 = bu.append("abc");
//        System.out.println(bu);
//        System.out.println(bu2);
//        System.out.println(bu==bu2);//abc
//        System.out.println(bu.equals(bu2));//返回的是自身，赋值的是自身的地址值，true

        /*
        * 使用append方法无需接受返回值，因为该方法返回的是自身*/
//        bu.append("abc");
//        bu.append(1);
//        bu.append(true);
//        bu.append(8.8);
//        bu.append("中国");
//        System.out.println(bu);


        //因为返回的是自身，所以可以使用链式编程
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase());
        bu.append("abc").append(true).append(1).append(8.8).append("中国");
        System.out.println(bu);
    }
}
