package cn.itcast.day10.demo03;
/*
* 这个子接口中有methodA methodB methodCommon method 4个抽象方法*/
public interface MyInterface extends MyInterfaceA, MyInterfaceB{
    public abstract void method();

    @Override
    public default void methodDefault() {
        System.out.println("覆盖重写了两个父接口中的默认方法，不然会冲突");
    }
}
