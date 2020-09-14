package cn.itcast.day09.demo11;
//抽象方法 加上abstract关键字，去掉大括号直接分号结束
//抽象方法所在的类必须是抽象类，在class之前加上abstract即可
/*
* 1.不能直接new抽象类对象
* 2.必须使用一个子类继承抽象类父类
* 3.子类必须覆盖重写（实现）抽象父类中所有的抽象方法：子类方法去掉absract关键字，补上大括号及内容
* 4.创建子类对象进行使用*/
public abstract class Animal {
    //抽象方法，代表吃东西，吃什么不确定，大括号内容不确定
    public abstract void eat();

    public void normalMethod() {
        System.out.println("这是一个普通的成员方法");
    }
}
