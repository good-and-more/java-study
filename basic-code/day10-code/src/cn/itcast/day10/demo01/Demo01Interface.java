package cn.itcast.day10.demo01;
/*
* 接口不能直接使用，必须有一个实现类*/
public class Demo01Interface {
    public static void main(String[] args) {
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodsAbs();
        impl.methodsAbs2();
    }
}
