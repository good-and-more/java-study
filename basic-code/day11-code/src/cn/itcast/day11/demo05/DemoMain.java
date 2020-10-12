package cn.itcast.day11.demo05;
/*
* 如果接口的实现类，或者父类的子类，只需要使用唯一的一次，就可以省略该类的定义，改为使用匿名内部类
* 匿名内部类的定义格式
* 接口名称 对象名 = new 接口名称() {
*       //覆盖重写所有抽象方法
* }
* */
public class DemoMain {

    public static void main(String[] args) {
        //MyInterfaceImpl impl = new MyInterfaceImpl();
        //MyInterface impl = new MyInterfaceImpl();//左父右子 左边接口右边实现类 左边父类右边子类
        //impl.method();

        //MyInterface some = new MyInterface();//错误写法
        MyInterface some = new MyInterface() {
            @Override
            public void method() {
                System.out.println("在匿名内部类中覆盖重写了接口的抽象方法");
            }
        };
        some.method();

    }
}
