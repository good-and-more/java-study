package com.itheima.demo05.Collections;
/*
* public static <T> void sort(List<T> list) 将集合中元素按照默认方法排序
* 被排序的集合里面存储的元素，必须实现Comparable接口，重写接口中的方法compareTo，定义排序规则
* */
import java.util.ArrayList;
import java.util.Collections;

public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        //默认升序，只能传List集合，不能传Set集合，因为Set集合是无序的
        Collections.addAll(list01, 1, 3, 2);
        System.out.println(list01);
        Collections.sort(list01);
        System.out.println(list01);

        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("张三", 18));
        list03.add(new Person("李四", 20));
        list03.add(new Person("王五", 15));
        System.out.println(list03);
        Collections.sort(list03);
        System.out.println(list03);

    }
}
