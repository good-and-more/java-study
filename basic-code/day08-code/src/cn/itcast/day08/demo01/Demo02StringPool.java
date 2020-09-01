package cn.itcast.day08.demo01;
//双引号直接创建的字符串对象，会进入字符串常量池，new出来的字符串对象不在字符串常量池
//字符串常量池中的对象，保存的是byte数组的地址
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);
    }
}
