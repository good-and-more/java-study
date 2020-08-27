package cn.itcast.day06.demo01;
import cn.itcast.day06.demo01.Student1;

//创建一个对象 Student(类名称) stu(对象名) = new Student();
//使用一个对象 stu.name  stu.sleep();
//如果成员变量没有进行赋值，就会获得默认值，规则和数组一样
public class Demo02Student {
    public static void main(String[] args) {
        Student1 stu = new Student1();

        System.out.println(stu.name);
        stu.study();


    }
}
