package cn.itcast.day04.demo04;
//方法相同，参数列表不同的方法，可以触发方法重载
public class Demo04OverloadPrint {
    public static void main(String[] args) {
      myPrint(12);
      myPrint("尝试打印字符串");
    }

    public static void myPrint(byte num) {
        System.out.println(num);
    }

    public static void myPrint(short num) {
            System.out.println(num);
    }

    public static void myPrint(int num) {
        System.out.println(num);
    }

    public static void myPrint(long num) {
        System.out.println(num);
    }

    public static void myPrint(float num) {
        System.out.println(num);
    }

    public static void myPrint(double num) {
        System.out.println(num);
    }

    public static void myPrint(char word) {
        System.out.println(word);
    }

    public static void myPrint(boolean is) {
        System.out.println(is);
    }

    public static void myPrint(String str) {
        System.out.println(str);
    }
}
