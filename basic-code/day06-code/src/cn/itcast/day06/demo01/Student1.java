package cn.itcast.day06.demo01;
/*
* 定义一个类
* 属性：成员变量-写在类中，方法外。写在方法内的叫局部变量
*   String name:姓名
*   int age:年龄
* 行为：成员方法
*   public void eat(){}
*   public void sleep(){}
*   public void study(){}
*
* */
public class Student1 {
    String name;
    int age;

    //成员方法，不写
    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public void study(){
        System.out.println("学习");
    }
}
