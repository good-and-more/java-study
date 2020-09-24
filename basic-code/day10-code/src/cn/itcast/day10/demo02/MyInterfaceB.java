package cn.itcast.day10.demo02;

public interface MyInterfaceB {
//    static {
//
//    }
    //接口不能有静态代码块和构造方法
    //public MyInterfaceA() {}

    public abstract void methodB();
    public abstract void methodAbs();
    public default void methodDefault() {
        System.out.println("bbb");
    }
}
