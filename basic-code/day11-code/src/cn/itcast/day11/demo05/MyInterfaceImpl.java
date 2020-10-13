package cn.itcast.day11.demo05;

public class MyInterfaceImpl implements MyInterface{
    @Override
    public void method1() {
        System.out.println("覆盖重写了接口中的抽象方法1");
    }

    @Override
    public void method2() {
        System.out.println("覆盖重写了接口中的抽象方法2");
    }
}
