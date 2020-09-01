package cn.itcast.day08.demo02;
/*
* ==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法
* public boolean equals(Object obj);参数可以是任何对象，只有参数是一个字符串并且内容相同才会返回true
* equals方法有对称性，但是推荐把常量写在前面，比如"abc".equals(str5);
* */
public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str1));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));

        String str4 = "hello";
        System.out.println(str1.equals(str4));

        String str5 = null;
        System.out.println("abc".equalsIgnoreCase(str5));//忽略英文大小写对比字符串内容
        //System.out.println(str5.equals("abc"));//会报空指针异常

    }
}
