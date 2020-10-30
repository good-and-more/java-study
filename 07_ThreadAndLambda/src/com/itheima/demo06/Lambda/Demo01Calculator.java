package com.itheima.demo06.Lambda;
/*
* 使用lambda表达式的标准格式调用invokeCalc方法，完成120和130的相加计算
* */
public class Demo01Calculator {
    public static void main(String[] args) {
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        //使用lambda表达式简化匿名内部类简化书写
        invokeCalc(10,20,(int a,int b)->{
            return a+b;
        });

    }

    /*
    * 参数传递两个int类型的整数
    * 参数传递Calculator接口
    * 方法内部调用Calculator中的方法calc计算两个整数的和
    * */
    private static void invokeCalc(int a,int b,Calculator calculator){
        int sum = calculator.calc(a,b);
        System.out.println(sum);
    }
}
