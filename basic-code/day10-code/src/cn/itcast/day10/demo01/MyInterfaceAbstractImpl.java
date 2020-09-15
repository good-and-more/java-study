package cn.itcast.day10.demo01;
/*实现类必须重写接口中所有的抽象方法
* 如果没有重写所有的抽象方法，说明该实现类也是一个抽象类*/
public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {
    @Override
    public void methodsAbs() {
        System.out.println("抽象方法1");
    }

    @Override
    public void methodsAbs2() {
        System.out.println("抽象方法2");
    }
}
