package cn.itcast.day08.demo02;
//public int length()获取字符串长度
//public String concat(String str)将当前字符串和参数字符串拼接成返回值的新字符串
//public char charAt(int index) 获得指定索引位置的单个字符
//public int indexOf(String str) 查找参数字符串在本字符串中首次出现的索引位置，如果没有返回-1值

public class Demo02StringGet {
    public static void main(String[] args) {
        int length = "123123123123".length();
        System.out.println("字符串的长度是："+length);

        System.out.println("Hello".concat("World"));

        System.out.println("Hello".charAt(2));

        System.out.println("Hell1o".indexOf('l',3));
        System.out.println("Hello".indexOf('1'));
    }
}
