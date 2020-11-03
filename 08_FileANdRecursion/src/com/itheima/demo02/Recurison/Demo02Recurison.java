package com.itheima.demo02.Recurison;
/*
* 练习：使用递归计算1到n之间的和
* */
public class Demo02Recurison {
    public static void main(String[] args) {
        int s = sum(100);
        int jcresult = jc(100);
        System.out.println(s);
        System.out.println(jcresult);
    }

    public static int sum(int n) {
        //加到1结束
        if(n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static int jc(int n) {
        //乘到1结束
        if(n == 1) {
            return 1;
        }
        return n * sum(n - 1);
    }
}
