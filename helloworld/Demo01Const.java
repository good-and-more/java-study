/*
常量的分类
1.字符串常量：双引号引起来的部分
2.整数常量
3.浮点数常量
4.字符常量：单引号引起来的单个字符
5.布尔常量：true false
6.空常量：null
 */

public class Demo01Const {
    public static void main(String[] args) {
        System.out.println("123");
        System.out.println("");
        //字符串常量可以为空
        System.out.println("你好世界！");

        //整数常量
        System.out.println(30);

        //浮点数常量
        System.out.println(3.14);
        System.out.println(-0.618);

        //字符常量
        System.out.println('a');
        System.out.println('6');
        //System.out.println('');字符常量两个单引号之间必须有且仅有一个字符
        //System.out.println('12');

        //布尔常量
        System.out.println(true);
        System.out.println(false);

        //空常量不能直接打印输出
        //System.out.pringln(null);
    }
}