package cn.itcast.day07.demo03;
import java.util.Random;
public class Demo01Random {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0;i<10;i++){
            System.out.println(random.nextInt());
        }
    }
}
