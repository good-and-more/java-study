package cn.itcast.day10.demo02;

public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB{
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了AB接口都有的抽象方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口中同名的默认方法重写");
    }

}
