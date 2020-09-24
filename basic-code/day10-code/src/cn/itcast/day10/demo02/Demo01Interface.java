package cn.itcast.day10.demo02;
/*
* 接口是没有静态代码块或构造方法的
* 一个类的直接父类是唯一的，但是一个类可以同时实现多个接口
* public class MyInterfaceImpl implements MyInterfaceA，MyInterfaceB
*
* 实现多个接口，必须覆盖重写多个接口中的所有抽象方法
* 不同接口中的同名抽象方法，只用重写一次
* 如果没有覆盖重写所有的抽象方法，必须将实现类变为抽象类
* 如果不同接口中有同名的默认方法，那么实现类必须对默认方法覆盖重写
* */
public class Demo01Interface {
}
