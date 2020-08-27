package cn.itcast.day07.demo01;
import java.util.Scanner;
//只有java.lang包下的内容不需要导包，其他的包都需要import
/*
*
* */
public class Demo01Scanner {
    public static void main(String[] args) {
        //System.in 从键盘输入
        Scanner sc = new Scanner(System.in);
        /*获取键盘输入的int数字，int num = sc.nextInt();
        * 获取键盘输入的字符串，String str = sc.next();
        * */
        int num = sc.nextInt();
        System.out.println("输入的int数字是:"+num);
        String str = sc.next();
        System.out.println("输入的字符串是:"+str);
    }
}
