package cn.itcast.day11.demo01;
/*
* final关键字代表最终、不能改变
*
* 常见的4种用法
* 1.可以修饰一个类
* 2.可以修饰一个方法
* 3.可以修饰局部变量
* 4.可以修饰一个成员变量
* */
public class Demo01Final {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);

        //一旦使用final修饰局部变量，那么这个变量就不能修改，那不就是常量吗，跟常量有什么区别？
        final int num2 = 200;
        System.out.println(num2);//200
        //num2 = 250;//错误写法，不能改变
        //num2 = 200;//错误写法
        final int num3;
        num3 = 30;//正确写法，只有保证一次赋值即可

        //对于基本类型来说，不可改变说的是变量当中的数据不可改变
        //对于引用类型来说，不可改变说的是变量当中的地址值不可改变
        Student stu1 = new Student("赵丽颖");
        System.out.println(stu1);
        System.out.println(stu1.getName());//赵丽颖
        stu1 = new Student("霍建华");
        System.out.println(stu1);
        System.out.println(stu1.getName());//霍建华
        System.out.println("=============");

        final Student stu2 = new Student("高圆圆");
        System.out.println(stu2);
        System.out.println(stu2.getName());//高圆圆
        //stu2 = new Student("赵又廷");//只能赋值一次，地址值不能变化，会报错
        stu2.setName("高圆圆圆");
        System.out.println(stu2);
        System.out.println(stu2.getName());//应该出现高圆圆圆，地址值不变，里面的内容变了
    }
}
