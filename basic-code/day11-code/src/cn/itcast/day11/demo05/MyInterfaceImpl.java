package cn.itcast.day11.demo05;

public class MyInterfaceImpl implements MyInterface{
    @Override
    public void method() {
        System.out.println("覆盖重写了接口中的抽象方法");
    }
}
