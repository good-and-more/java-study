package cn.itcast.day04.demo03;

public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(5);
    }
    public static void printCount(int count){
        for (int i = 1; i <= count; i++) {
            System.out.println("HelloWorld"+i);
        }
        System.out.println("程序结束。");
    }

}
