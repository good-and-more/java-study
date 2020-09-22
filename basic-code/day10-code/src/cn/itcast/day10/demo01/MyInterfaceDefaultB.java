package cn.itcast.day10.demo01;

public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("在defaultB中实现了抽象方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("在实现类b中覆盖重写了默认方法");
    }

}
