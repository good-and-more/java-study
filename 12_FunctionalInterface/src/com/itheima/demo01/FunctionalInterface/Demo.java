package com.itheima.demo01.FunctionalInterface;
/*
* 函数式接口的使用，一般作为方法的参数和返回值类型使用
* */
public class Demo {
    public static void main(String[] args) {
        show(new MyFunctionalInterfaceImpl());
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });

        //调用show方法，方法的参数是一个函数式接口，可以用lambda表达式
        show(()->{
            System.out.println("使用lambda表达式重写接口中的抽象方法");
        });
    }

    public static void show(MyFunctionalInterface myInter){
        myInter.method();
    }
}
