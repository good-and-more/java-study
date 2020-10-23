package com.itheima.demo03.Exception;

public class Zi extends Fu{
    //子类重写父类方法，抛出和父类相同的异常
    @Override
    public void show01() throws NullPointerException, ClassCastException {
        super.show01();
    }

    //抛出父类异常的子类，ArrayIndexOutOfBoundsException是IndexOutOfBoundsException的子类
    @Override
    public void show02() throws ArrayIndexOutOfBoundsException {
        super.show02();
    }

    //或者直接不抛出异常
    @Override
    public void show03() {
        super.show03();
    }

    //父类没有抛出异常，子类也不能抛出异常，不然报错
    @Override
    public void show04() {
        super.show04();
    }
}
