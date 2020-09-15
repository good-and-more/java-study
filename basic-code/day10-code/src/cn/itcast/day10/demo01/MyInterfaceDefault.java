package cn.itcast.day10.demo01;
/*
* java8中接口允许定义默认方法
* public default 返回值类型 方法名称（参数列表） {
*   方法体
* }
* 接口当中的默认方法可以解决接口升级的问题，如下示例
* */
public interface MyInterfaceDefault {
    //抽象方法
    void methodAbs();

    //新添加了一个抽象方法,此时AB两个实现类均报错，如果不想修改这两个实现类，需要把新添加的抽象方法改为默认方法
    //public abstract void methodAbs2();

    public default void methodDefault() {
        System.out.println("这是新添加的默认方法");
    }
}
