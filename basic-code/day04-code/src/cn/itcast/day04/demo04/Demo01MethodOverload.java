package cn.itcast.day04.demo04;
/*方法的重载
* 名称相同，参数列表不同
* 方法重载与下列因素相关：
* 1.参数个数不同
* 2.参数类型不同
* 3.参数的多类型顺序不同
*
* 方法重载与下列因素无关：
* 1.与参数的名称无关(名称xiang)
* 2.与方法的返回值类型无关*/
public class Demo01MethodOverload {
    public static void main(String[] args) {
        /*System.out.println(sumTwo(10,20));
        System.out.println(sumThree(10,20,30));
        System.out.println(sumFour(10,20,30,40));*/
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
    }

    /*public static int sumTwo(int a,int b) {
        return a + b;
    }

    public static int sumThree(int a,int b,int c) {
        return a + b + c;
    }

    public static int sumFour(int a,int b,int c,int d) {
        return a + b + c + d;
    }*/

    public static int sum(int a,int b) {
        return a + b;
    }

    public static int sum(int a,int b,int c) {
        return a + b + c;
    }

    public static int sum(int a,int b,int c,int d) {
        return a + b + c + d;
    }
}
