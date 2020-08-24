package cn.itcast.day04.demo03;
/*
定义一个方法用于求1到100的所有数字的和
*/
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println(getSum());
    }

    public static int getSum() {
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum += i;
        }
        return sum;
    }
}
