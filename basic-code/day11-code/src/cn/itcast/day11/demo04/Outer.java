package cn.itcast.day11.demo04;
/*
* 在方法内部的类是局部内部类
*
* 定义一个类的权限修饰符规则：
* 1.外部类：public （default）
* 2.成员内部类：public protected default private 成员内部类规则跟成员变量类似
* 3.局部内部类：什么都不能写*/
public class Outer {
    public void methodOuter() {
        class Inner {
            int num = 10;
            public void methodInner() {
                System.out.println(num);
            }
        }

        Inner inner = new Inner();
        inner.methodInner();
    }
}

