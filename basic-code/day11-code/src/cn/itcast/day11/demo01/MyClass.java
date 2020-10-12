package cn.itcast.day11.demo01;
/*
* public final class 类名称 {
*   // ....
* }
* 含义：final修饰的当前类，不能有任何的子类
* 注意：一个类如果是final类，其中所有的成员方法无法覆盖重写，但是可以覆盖重写父类种的方法*/
public final class MyClass {
    public void method() {
        System.out.println("方法执行");
    }
}
