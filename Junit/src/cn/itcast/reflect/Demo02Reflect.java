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
    }
}
