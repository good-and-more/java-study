package cn.itcast.day07.demo02;
import java.util.Scanner;

//匿名对象可以当作方法的参数和返回值（任何数据类型都可以当作方法的参数和返回值）
public class Demo02Anonymous {
    public static void main(String[] args) {
        //匿名对象的使用方法
//        int num = new Scanner(System.in).nextInt();
//        System.out.println(num);

//      methodParam(new Scanner(System.in));
        Scanner sc = methodReturn();//这里命名一个Scanner对象，对象来自方法中返回的匿名对象，本来匿名的被赋值命名为sc
        int num = sc.nextInt();
        System.out.println("输入的是:"+num);
    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println(num);
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);//这里直接返回一个匿名对象
    }

}
