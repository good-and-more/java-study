package com.itheima.demo03.Generic;

public class Demo04GenericInterface {
    public static void main(String[] args) {
//      创建
        GenericInterfaceImpl1 impl = new GenericInterfaceImpl1();
        impl.method("泛型指定数据类型");

        GenericInterfaceImpl1 impl0 = new GenericInterfaceImpl1();
        //impl0.method(123);//无法传递int，因为第一种方法在实现类内部已经确定了泛型用什么数据类型

        /*创建GenericInterfaceImpl2对象*/
        GenericInterfaceImpl2<Integer> impl2 = new GenericInterfaceImpl2<>();
        impl2.method(10);

        GenericInterfaceImpl2<Double> impl3 = new GenericInterfaceImpl2<>();
        impl3.method(10.23);
    }
}
