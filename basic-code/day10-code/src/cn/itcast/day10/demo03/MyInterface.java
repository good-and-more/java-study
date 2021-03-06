package cn.itcast.day10.demo03;
/*
* 这个子接口中有methodA methodB methodCommon method 4个抽象方法
* methodA 来源于接口A
* methodB 来源于接口B
* methodCommon 同时来源于接口A和B
* method 来源于我自己*/
public interface MyInterface extends MyInterfaceA, MyInterfaceB{
    public abstract void method();

    @Override
    public default void methodDefault() {
        System.out.println("覆盖重写了两个父接口中的默认方法，不然会冲突");
    }
}
