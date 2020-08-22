/*
基本数据类型
整数型 byte short int（默认） long
浮点型 float double（默认）
字符型 char
布尔型 boolean
数据范围和字节数不一定相关，例如float数据范围比long更广泛，但是float是4字节，long是8字节，因为float用的科学计数法
使用默认类型之外的类型，需要加后缀，例如System.out.println(3.14F)是float类型；100L是100用long型，不是默认的int

数据类型 变量名称：创建了一个变量
变量名称 = 数据值；赋值

数据类型 变量名称 = 变量值；一步到位
 */

public class Demo02Variable {
    public static void main(String[] args) {
        int num1;
        num1 = 10;
        System.out.println(num1);

        num1 = 30;
        System.out.println(num1);
        System.out.println("===============================");

        short num2 = 32767;
        System.out.println(num2);

        byte num3 = 30;
        System.out.println(num3);
        //byte num3 = 400; 右侧超出了byte数据范围，错误

        long num6 = 3000000000L;
        System.out.println(num6);

        float num7 = 2.5F;
        System.out.println(num7);

        double num8 = 1.2;
        System.out.println(num8);

        char word1 = '中';
        System.out.println(word1);

        boolean var1 = true;
        System.out.println(var1);//ture
        boolean var2 = var1;
        System.out.println(var2);//true
    }
}
