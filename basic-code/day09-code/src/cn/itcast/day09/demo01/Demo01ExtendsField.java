package cn.itcast.day09.demo01;

public class Demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu = new Fu();//创建父类对象
        System.out.println(fu.numFu);//只能使用父类的东西，没有任何子类的东西

        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println(zi.num);

        zi.methodZi();//这个方法是子类的，优先用子类的成员变量，出现的是200
        zi.methodFu();//这个方法是父类的，优先用父类中的成员变量

    }
}
