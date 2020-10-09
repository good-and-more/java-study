package cn.itcast.day10.demo06;
/*
* 向上转型一定是安全的，但是一旦转型为父类，即无法调用子类特有内容
*
* 解决方法，用对象的向下转型 还原
* 格式： 子类名称 对象名 = （子类名称）父类对象*/
public class Demo01Main {
    public static void main(String[] args) {
        //对象的向上转型，就是父类引用指向子类对象
        //通过多态的写法进行对象的向上转型
        Animal animal = new Cat();
        animal.eat();//猫吃鱼

        //animal.catchMouse();//错误写法

        System.out.println("=================");

        //本来是猫，还原成猫
        Cat cat = (Cat)animal;
        cat.catchMouse();//可以调用子类特有方法

        //错误的向下转型，编译不会报错，运行出现java.lang.ClassCastException 类转换异常
        Dog dog = (Dog)animal;
    }
}
