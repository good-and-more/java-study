package com.itheima.demo06.StringBuilder;
/*
* StringBuilder和String可以相互转换
* String->StringBuilder 可以使用StringBuilder的构造方法
* StringBuilder->String 可以使用StringBuilder中的toString方法
* */
public class Demo03toString {
    public static void main(String[] args) {
        String str = "测试String和StringBuilder相互转换";
        StringBuilder stringBuilder = new StringBuilder(str);
        //往StringBuilder中添加数据
        stringBuilder.append("增加数据");
        System.out.println("stringBuilder："+stringBuilder);
        System.out.println("===================");
        String str2 = stringBuilder.toString();
        System.out.println(str2);

    }
}
