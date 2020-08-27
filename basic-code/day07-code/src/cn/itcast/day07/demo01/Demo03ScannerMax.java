package cn.itcast.day07.demo01;

import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {
        //new一个scanner对象，获取键盘输入
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int max = num1 >= num2 ? num1:num2;
        int num3 = scanner.nextInt();
        max = max >= num3 ? max : num3;
        System.out.println("最大的数是:"+max);
    }

}
