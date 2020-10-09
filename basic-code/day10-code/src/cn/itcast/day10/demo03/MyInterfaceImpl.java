package cn.itcast.day10.demo03;
/*
* 实现接口MyInterface*/
public class MyInterfaceImpl implements MyInterface{
    @Override
    public void method() {
        System.out.println("实现类要重写接口中的抽象方法");
    }

    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }

    @Override
    public void methodCommon() {

    }
}
