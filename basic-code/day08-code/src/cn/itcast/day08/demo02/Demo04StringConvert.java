package cn.itcast.day08.demo02;
//字符串的转换方法
public class Demo04StringConvert {
    public static void main(String[] args) {
        String str1 = "123456789";
//      转换成字符数组
        char[] chars = str1.toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);

        //转换成字节数组
        byte[] bytes = str1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i]);
        }

        String str2 = "How do you do?";
        String str3 = str2.replace("o", "*");
        System.out.println(str3);
    }
}
