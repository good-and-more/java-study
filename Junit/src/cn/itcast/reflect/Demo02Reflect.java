package cn.itcast.reflect;

import java.lang.reflect.Field;

public class Demo02Reflect {
    public static void main(String[] args) throws NoSuchFieldException {
        //获取Person的Class对象
        Class personClass = Person.class;
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Field a = personClass.getField("a");

        //getDeclaredFields():获取所有的成员变量，不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        Field d = personClass.getDeclaredField("d");
    }
}
