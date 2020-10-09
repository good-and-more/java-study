package cn.itcast.day10.demo03;
/*
* 1.类与类之间是单继承的，直接父类只能有一个
* 2.类与接口之间是多实现的，一个类可以实现多个接口
* 3.接口与接口之间是多继承的
*
* 多个父接口中的抽象方法冲突，没问题
* 多个父接口中的默认方法冲突，有不同的方法体，子接口必须进行默认方法的覆盖重写，而且带着default关键字*/
public class Demo01Relations {
    public static void main(String[] args) {
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.method();
        impl.methodDefault();
    }
}
