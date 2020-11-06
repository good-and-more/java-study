package com.itheima.demo05.ObjectMethodReference;
/*
* 通过对象名引用成员方法
* 前提是对象名是已经存在的，成员方法也是已经存在的
* */
public class Demo01ObjectMethodReference {
    public static void printString(Printable p) {
        p.print("Hello");
    }

    public static void main(String[] args) {
        printString((s)->{
            MethodRerObject obj = new MethodRerObject();
            obj.printUpperCaseString(s);
        });

        MethodRerObject obj = new MethodRerObject();
        printString(obj::printUpperCaseString);
    }
}
