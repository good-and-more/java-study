package cn.itcast.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Demo03Reflect {
    public static void main(String[] args) throws Exception {
        //获取Person的Class对象
        Class personClass = Class.forName("cn.itcast.reflect.Person");
        /*
        * 获取Class对象的构造方法们;
        *   Constructor<?>[] getConstructors()
        *   Constructor<T> getConstructor(类<?>... parameterTypes)
        *
        *   Constructor<?>[] getDeclaredConstructors()
        *   Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
        * */
        //Constructor<T> getConstructor(类<?>... parameterTypes) 参数是类获取字节码class对象
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        Object person = constructor.newInstance("张三", 23);
        System.out.println(person);
        System.out.println("====================");

        Constructor constructor2 = personClass.getConstructor();
        System.out.println(constructor);
        Object person2 = constructor.newInstance("李四", 24);
        System.out.println(person2);
        System.out.println("====================");
        Object o = personClass.newInstance();//如果调用空参构造f
        System.out.println(o);


    }
}
