package cn.itcast.annotation.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Method;

/*
* 简单的测试框架
* 当主方法执行后，会自动检测所有加了check注解的方法，判断方法是否异常，机录到文件中
* */
public class TestCheck {
    public static void main(String[] args) throws Exception {
        //1。创建计算器对象
        Calculator c = new Calculator();
        //2.获取字节码文件对象
        Class cls = c.getClass();
        //3.获取所有方法
        Method[] methods = cls.getMethods();
        int number = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        //4.判断方法上是否有check注解
        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)){
                //5。Check注解，执行
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    //6.捕获异常
                    //记录到文件中
                    number++;
                    bw.write(method.getName()+"方法出异常了");
                    bw.newLine();
                    bw.write("异常的名称是："+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因是："+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("============================");
                    bw.newLine();
                }
            }
        }
        bw.write("本次测试一共出线"+number+"次异常");

        bw.flush();
        bw.close();
    }
}
