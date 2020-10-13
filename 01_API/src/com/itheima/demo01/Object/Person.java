package com.itheima.demo01.Object;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
    * 直接打印对象的地址值无意义，所以重写toString*/

//    @Override
//    public String toString() {
//        return "Person{name="+name+",age="+age+"}";
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    * Object类的equals方法，默认比较两个对象的地址值，没有意义
    * 所以要重写equals方法，比较两个对象的属性（name，age）
    * 问题：隐含着一个多态，无法使用子类特有的内容（属性和方法）
    * Object obj = p2 = new Person（“古力娜扎”，19）；
    *
    * */
//    @Override
//    public boolean equals(Object obj){
//        //增加一个判断，如果传递的参数是null，直接返回false
//        if(obj == null) {
//            return false;
//        }
//
//        if(obj == this) {
//            return true;
//        }
//
//        if(obj instanceof Person) {
//            Person p = (Person)obj;
//            boolean b = this.name.equals(p.name) && this.age == p.age;
//            return b;
//        }
//        //不是person类型，直接返回false
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //getClass() != o.getClass() 使用反射技术判断o是否是Person类型，等效于instanceof
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
