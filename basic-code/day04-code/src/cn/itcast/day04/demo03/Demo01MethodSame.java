package cn.itcast.day04.demo03;
/*
定义一个方法，用来判断两个数字是否相同
*/
public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10,10));
    }

    public static boolean isSame(int a,int b) {
//        boolean same;
//        if (a == b) {
//            same = true;
//        } else {
//            same = false;
//        }
        return a == b;
    }

}
