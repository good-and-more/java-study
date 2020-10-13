package com.itheima.demo01.Object;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        //String s1 = "abc";
        String s1 = null;
        String s2 = "abc";
        //boolean b = s1.equals(s2);//NullPointerException null不能调用方法，会抛出空指针异常
        /*
        * Objects类的equals方法可以防止空指针异常*/
        boolean b2 = Objects.equals(s1, s2);
        System.out.println(b2);

    }
}
