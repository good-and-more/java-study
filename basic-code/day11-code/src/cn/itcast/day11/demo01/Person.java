package cn.itcast.day11.demo01;
/*
* 对于成员变量来说，如果使用final关键字修饰，那么该变量也照样不可变
* 1.由于成员变量具有默认值，用final必须手动赋值，不会给默认值，
* 2.对于final成员变量，要么直接赋值，要么通过构造方法赋值。二者选其一
* 3.必须保证类当中的所有重载的构造方法都对final成员变量赋值，如果不赋值，那就用直接赋值
* */
public class Person {
    private String name = "luhan";

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
