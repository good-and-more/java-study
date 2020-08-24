package cn.itcast.day04.demo04;
/*
* 比较两个数据是否相等
* 参数类型分别为两个byte、short、int、long*/
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        System.out.println(isSame(12,12));
        System.out.println(isSame(700,700));
        System.out.println(isSame(65535,65535));
        System.out.println(isSame(65535L,65535L));
    }

    public static boolean isSame(byte a,byte b) {
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a,short b) {
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a,int b) {
        boolean same = (a == b);
        return same;
    }

    public static boolean isSame(long a,long b) {
        return a == b;
    }
}
