/*
使用变量时需要注意的事情：
1.变量名不能重复
2.对于float和long，字母F和L不能丢掉
3.变量数值不能超过左侧类型范围
4.没有进行赋值的变量不能直接使用
5.变量使用不能超过作用域的范围：从定义变量的一行开始，一直到直接所属的大括号结束为止；
6.可以通过一个语句创建多个变量，但一般情况不推荐这么写
 */
public class Demo03VariableNotice {
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
