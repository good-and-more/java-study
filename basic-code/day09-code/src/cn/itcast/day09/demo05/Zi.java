package cn.itcast.day09.demo05;

public class Zi extends Fu {
    int num = 20;

    @Override//注解，不是注释
    public void method() {
        System.out.println("子类方法调用");
    }

    public Object method1() {
        return null;
    }
}
