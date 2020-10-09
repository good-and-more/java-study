package cn.itcast.day10.demo05;
/*
* 访问成员变量的两种方法：
* 1.直接通过对象名称访问成员变量：看等号左边是谁就优先用谁，没有则向上找
* 2.间接通过成员方法访问成员变量，看该方法属于谁就优先用谁，没有则向上找*/

public class Demo01MultiField {
    public static void main(String[] args) {
        //使用多态写法，父类引用指向子类对象
        Fu obj = new Zi();
        System.out.println(obj.num);//此处等号左边是Fu，直接访问Fu类的成员变量
        //System.out.println(obj.age);//此处无法向下查找，所以是错误的
        System.out.println("==========================");

        obj.showNum();//该方法属于子类，优先用子类中的
    }
}
