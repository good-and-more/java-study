package com.itheima.demo07.Integer;


public class Demo01Integer {
    public static void main(String[] args) {
        //    装箱
        Integer in1 = new Integer(1);
        Integer in2 = new Integer("123");
        System.out.println(in1);
        System.out.println(in2);

        //静态方法装箱
        Integer in3 = Integer.valueOf(2);
        System.out.println(in3);

        //拆箱，从包装类中取出基本类型的数据
        int i = in1.intValue();
        System.out.println(i);

    }


}
