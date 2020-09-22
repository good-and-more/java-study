package cn.itcast.day10.demo01;
/*
* 如何使用默认方法
* 默认方法会被实现类继承
* 默认方法也可以被实现类覆盖重写*/
public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();//实际运行的是右侧的实现类
        a.methodDefault();//调用默认方法，如果实现类中没有，会向继承的接口中寻找默认方法
        //AB类不用改，接口新添加的默认方法也可以通过AB类调用

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();
    }
}
