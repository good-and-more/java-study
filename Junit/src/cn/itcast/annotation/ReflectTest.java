package cn.itcast.annotation;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/*
* 框架类
* */
@Pro(className = "cn.itcast.annotation.Demo01",methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //可以创建任意类，执行类内的任意方法
        /*
         * 不能改变该类的任何代码，可以创建任意类的对象，执行任意方法
         * */
        //1.解析注解
        //1.1，获取该类的字节码文件
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //2.获取上边的注解对象
        //其实在内存中生成了该注解接口的子类实现对象
        Pro an = reflectTestClass.getAnnotation(Pro.class);
        //3.调用注解对象定义中定义的抽象方法
        an.className()

    }
}
