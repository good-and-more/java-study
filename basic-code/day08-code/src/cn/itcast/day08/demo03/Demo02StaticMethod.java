package cn.itcast.day08.demo03;
//static修饰成员方法变为静态方法，不属于对象属于类
/*
* 静态变量 类名称.静态变量
* 静态方法 类名称.静态方法()
* 静态方法不能直接访问非静态
* 静态方法中不能使用this
* */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();//首先创建对象
        //然后才能使用没有static关键字的成员方法
        obj.method();

        //静态方法额外可以直接通过类名称调用
        obj.methodStatic();
        MyClass.methodStatic();

        myMethod();//
    }

    public static void myMethod() {
        System.out.println("这是一个自己的方法");
    }
}
