package cn.itcast.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo04Reflect {
    public static void main(String[] args) throws Exception {
        //获取Person的Class对象
        Person p = new Person();
        Class personClass = p.getClass();
        /*
        * 获取Class对象的成员方法们;
        *   Method[] getMethods()
        *   Method getMethod(String name,类<?>... parameterTypes)
        *
        *   Method[] getDeclaredMethods()
        *   Method getDeclaredMethod(String name,类<?>... parameterTypes)
        * */
        //获取指定名称的方法
        Method eat_method = personClass.getMethod("eat");
        eat_method.invoke(p);

        //获取指定名称的方法
        Method eat_method_food = personClass.getMethod("eat",String.class);
        eat_method_food.invoke(p,"godiva");

        System.out.println("=====================");

        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            System.out.println(method);
            //
            System.out.println(method.getName());
            //写一个框架，帮我们创建任意类的对象，并执行其中任意方法
        }
    }
}
