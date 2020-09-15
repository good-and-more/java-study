package cn.itcast.day10.demo01;
/*
* 任何版本的java中均可在接口中定义抽象方法
* java7中包含常量 抽象方法
* java8中包含默认方法 静态方法
* java9中包含私有方法
* 方法三要素随意定义
* */
public interface MyInterfaceAbstract {
//    这是一个抽象方法
    public abstract void methodsAbs();

    void methodsAbs2();//也是抽象方法
}
