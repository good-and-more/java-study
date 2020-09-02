package cn.itcast.day08.demo03;
/*
* 当第一次用到本类时，静态代码块执行唯一的一次
* 静态内容优先执行，比构造方法还要先执行
* 静态代码块典型用途：用于给静态成员赋值
* */
public class Person {
    static {
        System.out.println("静态代码块执行！");
    }

    public Person(){
        System.out.println("构造方法执行！");
    }
}
