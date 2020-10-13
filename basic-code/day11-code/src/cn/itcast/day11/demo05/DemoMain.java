package cn.itcast.day11.demo05;
/*
* 如果接口的实现类，或者父类的子类，只需要使用唯一的一次，就可以省略该类的定义，改为使用匿名内部类
* 匿名内部类的定义格式
* 接口名称 对象名 = new 接口名称() {
*       //覆盖重写所有抽象方法
* }
* 对格式”new 接口名称（） {...}“进行解析
* 1.new代表创建对象的动作
* 2.接口名称就是匿名内部类需要实现哪个接口
* 3.{...} 大括号和内部内容才是匿名内部类的内容
*
* 1.匿名内部类在创建对象时，只使用唯一的一次。如果再创建另一个对象需要重写一遍
* 如果希望多次创建对象，而且类的内容一样的话，必须使用单独定义的实现类
* 2.匿名对象，在调用方法时，只能调用唯一一次，如果希望同一个对象多次调用方法，那么必须给对象起个名字
* 3.匿名内部类时省略了实现类 子类的名称，匿名对象是省略了对象名称
* */
public class DemoMain {

    public static void main(String[] args) {
        //MyInterfaceImpl impl = new MyInterfaceImpl();
        //MyInterface impl = new MyInterfaceImpl();//左父右子 左边接口右边实现类 左边父类右边子类
        //impl.method();

        //MyInterface some = new MyInterface();//错误写法
        MyInterface some = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("在匿名内部类中覆盖重写了接口的抽象方法");
            }

            @Override
            public void method2() {
                System.out.println("在匿名内部类中覆盖重写了接口的抽象方法");
            }
        };
        some.method1();

        MyInterface objB = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("在匿名内部类中覆盖重写了接口的抽象方法");
            }

            @Override
            public void method2() {
                System.out.println("在匿名内部类中覆盖重写了接口的抽象方法");
            }
        };
        objB.method2();

        //使用了匿名内部类，又省略了对象名称，也是匿名对象
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("在匿名内部类中覆盖重写了接口的抽象方法");
            }

            @Override
            public void method2() {
                System.out.println("在匿名内部类中覆盖重写了接口的抽象方法");
            }
        }.method2();

    }
}
