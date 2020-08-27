package cn.itcast.day07.demo01;
import java.util.Scanner;
public class Demo02ScannerSum {
    public static void main(String[] args) {
        //new一个scanner对象，获取键盘输入
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println(num1+"+"+num2+"="+sum);
    }
}
