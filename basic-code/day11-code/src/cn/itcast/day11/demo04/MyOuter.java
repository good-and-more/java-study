package cn.itcast.day11.demo04;
/*
* 局部内部类，如果希望访问所在方法的局部变量，这个局部变量必须是有效final的
* 从java8以后开始，只要局部变量事实不变，那么final关键字可以省略
* 原因：
* 1.new出来的对象在堆内存中
* 2.局部变量跟着方法走，在栈内存中
* 3.方法运行结束后，立即出栈，局部变量会立刻消失
* 4.但是new出来的对象在堆内存中持续存在，直到垃圾回收消失
* 5.所以为了使用命短的局部变量，必须保证变量不可变，比如final，或者赋值一次不再变动*/
public class MyOuter {
    public void methodOuter() {
        final int num = 10;

        class MyInner {
            public void methodInner() {
                System.out.println(num);
            }
        }
    }
}
