package cn.itcast.day10.demo01;

public class Demo04InterfacePrivate {
    public static void main(String[] args) {
        MyInterfacePrivateImpl impl = new MyInterfacePrivateImpl();
        impl.methodCommon();//实现类中找methodCommon，没找到，再到接口中找
        impl.methodAnother();//实现类中有该方法
    }
}
