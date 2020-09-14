package cn.itcast.day09.demo07;

public class Demo01Constructor {
    /*
    * 继承关系中，父子类构造方法的访问特点
    * 1.子类构造方法中有默认隐含的super()调用，先调用父类的构造方法，再调用子类的构造方法
    * 2.可以通过super关键字，子类构造调用父类重载构造
    * 3.super的父类构造调用，必须是子类构造方法的第一个语句，且只能有一个
    * 4.子类必须调用父类构造方法，不写则默认赠送super()*/
    public static void main(String[] args) {
        Zi zi = new Zi();
    }
}
