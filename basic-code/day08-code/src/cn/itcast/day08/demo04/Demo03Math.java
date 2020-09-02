package cn.itcast.day08.demo04;
/*
* 数学运算相关操作
*
* */
public class Demo03Math {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));
        System.out.println((Math.abs(-2.5)));

        //向上取整
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(3.0));

        //向下取整
        System.out.println(Math.floor(30.5));
        System.out.println(Math.floor((31.6)));//

        //四舍五入
        System.out.println(Math.round(23.4));
        System.out.println(Math.round(23.1));

    }
}
