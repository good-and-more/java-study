package cn.itcast.day05.demo01;
//数组是引用数据类型
//数组的长度在运行过程中不可改变？
//动态初始化数组 数据类型【】 数据名称 = new 数据类型【数组长度】，两边数据类型必须一样，数组长度是int数字
//静态初始化 数据类型【】 数组名称 = new 数据类型【】{元素1，元素2，元素3，。。。}
public class Demo01Array {
    public static void main(String[] args) {
        int[] arrayA = new int[300];
        double[] arrayB = new double[10];
        String[] arrayC = new String[5];
        int[] arrayD = new int[]{5,15,25,35};
        String[] arrayE = new String[]{"Hello","World","Java"};
        String[] arrayF = {"也","可","以"};
        char[] arrayG = new char[5];
        boolean[] arrayH = new boolean[5];
        System.out.println(arrayA);//直接打印，输出的是数组对应的内存地址哈希值
        System.out.println(arrayB[0]);//动态初始化数组，浮点类型，默认值为0.0
        System.out.println(arrayC[1]);//动态初始化数组，引用类型，默认null
        System.out.println(arrayD[2]);
        System.out.println(arrayE[2]);
        System.out.println(arrayG[1]);//动态初始化数组，字符类型，默认'\u0000'，打印出来看不见
        System.out.println(arrayH[1]);//动态初始化数组，布尔类型，默认false
    }
}
