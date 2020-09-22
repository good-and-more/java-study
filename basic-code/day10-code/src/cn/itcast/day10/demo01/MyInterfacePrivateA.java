package cn.itcast.day10.demo01;

public interface MyInterfacePrivateA {
    //方法1和2中重复内容太多，需要抽取
//    public default void methodDefault1() {
//        System.out.println("defaultMethod1");
//        System.out.println("aaa");
//        System.out.println("aaa");
//        System.out.println("aaa");
//    }
//
//    public default void methodDefault2() {
//        System.out.println("defaultMethod2");
//        System.out.println("aaa");
//        System.out.println("aaa");
//        System.out.println("aaa");
//    }

    //需要抽取一个共有方法，但是又不能让实现类使用，从java9开始，接口中允许定义private default和private static方法
    public default void methodDefault1() {
        System.out.println("defaultMethod1");
        methodCommon();
    }

    public default void methodDefault2() {
        System.out.println("defaultMethod2");
        methodCommon();
    }

    public default void methodCommon() {
        System.out.println("aaa");
        System.out.println("aaa");
        System.out.println("aaa");
    }

}
