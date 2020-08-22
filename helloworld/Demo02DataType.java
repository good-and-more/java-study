/*
1.强制类型转换一般不推荐使用，有可能会发生精度损失，数据溢出
2.byte/short/char这三种类型都可以发生数学运算，先提升到int类型，然后再计算
 */
public class Demo02DataType {
    public static void main(String[] args) {
        //左边是int，右边是long，是从大到小，不能发生自动转换
        //int num = 100L;
        int num = (int) 100L;
        System.out.println(num);

        //long强制转换为int类型
        int num2 = (int) 6000000000L;
        System.out.println(num2);//1705032704，数据溢出

        int num3 = (int)3.5;
        System.out.println(num3);//3,损失了0.5，精度损失，所有的小数位都被舍掉了

        char zifu1 = 'A';//这是一个字符型变量，里面是大写字母A
        System.out.println(zifu1 + 1);//ASCII码表，字符类型加一，是ASCII码表后面一位的字符
    }
}
