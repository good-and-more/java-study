package cn.itcast.day10.demo01;

public class MyInterfacePrivateImpl implements MyInterfacePrivateA{
    public void methodAnother() {
        methodCommon();//也可以调用接口中的公有方法，因为是public
    }
}
