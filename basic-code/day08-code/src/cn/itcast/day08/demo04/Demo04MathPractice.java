package cn.itcast.day08.demo04;
//计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个
public class Demo04MathPractice {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int result = 0;
        for (int i = (int) min; i < max; i++) {//先取到范围内所有的整数，再循环判断整数绝对值的范围
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1) {
                System.out.println(i);
                result++;
            }
        }
        System.out.println("答案是："+result);
    }
}
