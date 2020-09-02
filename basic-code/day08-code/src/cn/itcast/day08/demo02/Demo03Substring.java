package cn.itcast.day08.demo02;

public class Demo03Substring {
    public static void main(String[] args) {
        String str1 = "123456789";
        String str2 = str1.substring(5);
        String str3 = str1.substring(5, 7);
        //String str3 = str1.substring(5, 4);//java.lang.StringIndexOutOfBoundsException

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
