package cn.itcast.day08.demo01;
//程序中所有的双引号字符串，都是String类的对象（就算没有new，也是创建的对象）
/*
* 1.字符串的内容永不可变
* 2.因为字符串不可改变，所以字符串可以共享使用，节省内存，用同一个对象
* 3.字符串效果上相当于char[]字符数组，是一个一个字符构成的数字，底层原理是byte[]字节数组
*
* 三种构造方法
* public String(); 创建一个空白字符串，不含有任何内容
* public String(char[] array);根据字符数组的内容，创建对应的字符串
* public String(byte[] array);根据字节数组的内容，创建对应的字符串
* 一种直接创建方法 String；
* */
public class Demo01String {
    public static void main(String[] args) {
        //空参创建字符串方法
        String str1 = new String();
        System.out.println(str1);

        //根据字符数组创建字符串
        char[] charArray = new char[]{'a', 'b', 'c'};
        String str2 = new String(charArray);
        System.out.println(str2);

        //根据字节数组创建字符串
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println(str3);

        //直接创建字符串
        String str4 = "helloworld!";
        System.out.println(str4);
    }
}
