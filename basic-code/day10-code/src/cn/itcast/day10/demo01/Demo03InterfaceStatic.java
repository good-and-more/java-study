package cn.itcast.day10.demo01;
/*
* 不能通过接口实现类的对象来调用接口中的静态方法*/
public class Demo03InterfaceStatic {
    public static void main(String[] args) {
        //创建了实现类对象,但是没有用，因为不能通过接口实现类的对象来调用接口中的静态方法
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

        //通过接口名称直接调用静态方法
        MyInterfaceStatic.methodStatic();
    }
}
