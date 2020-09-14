package cn.itcast.day09.demo08;
/*
* super关键字用法
* 1.在子类的成员方法中访问父类的成员变量
* 2.在子类的成员方法中访问父类的成员方法
* 3.在子类的构造方法中访问父类的构造方法
* this关键字也类似这三条，如果用this()调用了本类中的另一个构造方法，那super()不再赠送，因为super和this都要求自己是第一个语句，冲突了*/
public class Zi extends Fu{
    int num = 20;

    public Zi() {
        super();
        System.out.println("子类构造方法");
    }
    public void methodZi() {
        System.out.println(super.num);//访问父类中的num
    }

    public void method() {
        super.method();//访问父类成员方法
        System.out.println("子类方法");
    }
}
