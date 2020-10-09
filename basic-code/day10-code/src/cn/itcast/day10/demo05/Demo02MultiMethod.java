package cn.itcast.day10.demo05;
/*
* 在多态的代码中，成员方法的访问规则：new的是谁，优先用谁，没有则向上找
*
* 口诀：编译看左边，运行看右边
* 成员变量均看左边*/
public class Demo02MultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();//多态写法
        //
        obj.method();//父子都有的方法，优先用子类，输出“子类方法”

        //编译看左边，运行看右边 左边Fu类有methodFu方法，编译通过，运行右边Zi类没有有methodFu方法，向上找，调用输出“父类方法”
        obj.methodFu();//向上找父类，输出“父类方法”

        //编译看左，以对象为界，obj左边是Fu，没有methodZi，编译不通过
        //obj.methodZi();
    }
}
