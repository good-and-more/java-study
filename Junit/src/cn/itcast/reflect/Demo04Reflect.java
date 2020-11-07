package cn.itcast.reflect;

import java.lang.reflect.Constructor;

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
    }
}
