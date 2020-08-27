package cn.itcast.day07.demo03;
import java.util.Random;
import java.util.Scanner;
public class Demo04RandomGame {
    public static void main(String[] args) {
        int answer = (new Random().nextInt(100)) + 1;
        System.out.println("现在进行猜数字游戏，答案是一个1-100之间的整数，请输入你猜测的结果：");
        //System.out.println(answer);
        while(true) {//无限循环输入的步骤
            int input = new Scanner(System.in).nextInt();
            if (input > answer) {
                System.out.println("您猜的比答案大;");
            } else if (input < answer) {
                System.out.println("您猜的比答案小;");
            } else {
                System.out.println("您猜中了，您猜的是"+input+",答案是"+answer);
                break;
            }
        }
    }
}
