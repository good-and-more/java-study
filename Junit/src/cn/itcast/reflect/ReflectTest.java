package cn.itcast.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/*
* 框架类
* */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //可以创建任意类，执行类内的任意方法
        /*
        * 不能改变该类的任何代码，可以创建任意类的对象，执行任意方法
        * */
//        Person p = new Person();
//        p.eat();

//        Student stu = new Student();
//        stu.sleep();

        /*
        * 步骤：1.将需要创建的对象的全类名喝需要执行的方法定义再配置文件中
        * 2.在程序中加载读取配置文件
        * 3.使用反射技术来加载类文件进内存
        * 4.创建对象
        * 5.执行方法
        * */
        //1.在程序中加载读取配置文件，这里用到了之前学的Properties集合的方法
        Properties pro = new Properties();
        //1.1获取class目录下配置文件的方式
        //1.2如何获取文件的路径
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);
        //2.获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        //3.加载该类进内存
        Class cls = Class.forName(className);
        //4.创建对象
        Object obj = cls.newInstance();
        //5.获取方法对象
        Method method = cls.getMethod(methodName);
        //6.执行方法
        method.invoke(obj);

    }
}
