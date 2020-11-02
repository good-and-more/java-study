package com.itheima.demo04.Lambda;
/*
* 使用标准格式的Lambda调用invokeCook方法，打印输出“吃饭啦”字样
* */
public class Demo01Lambda {
    public static void main(String[] args) {
        /*参数是Cook接口，传递Cook接口的匿名内部类对象
        * */
        invokeCook(new Cook() {
            @Override
            public void makefood() {
                System.out.println("吃饭了");
            }
        });

        //使用lambda表达式，简化匿名内部类的书写
        invokeCook(()->{
            System.out.println("吃饭了");
        });

    }

    private static void invokeCook(Cook cook) {
        cook.makefood();
    }
}
