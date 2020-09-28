package cn.itcast.day10.demo04;
/*
* 代码中体现多态，父类引用指向子类对象
* 父类名称 对象名 = new 子类名称();
* 接口名称 对象名 = new 实现类名称();*/
public class Demo01Polymorphism {
    public static void main(String[] args) {
        //使用多态的写法
        Fu obj = new Zi();

        obj.method();
        obj.methodFu();
    }
}
