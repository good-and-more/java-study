package cn.itcast.day11.demo03;

public class Outer {
    int num = 10;//外部类的成员变量

    public class Inner {//成员内部类
        int num = 20;//内部类的成员变量

        public void methodInner() {
            int num = 30;//内部类方法的局部变量
            System.out.println(num);//30，输出局部变量，就近原则
            System.out.println(this.num);//输出20，this代表自己
            System.out.println(Outer.this.num);//外部类的成员变量
        }
    }
}
