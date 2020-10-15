package com.itheima.demo02.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* boolean hasNext() 如果仍有元素可以迭代，则返回true
* E next()，返回下一个元素
*
* Iterator迭代器是一个接口，无法直接使用，需要Iterator接口的实现类对象，获取实现类的方法特殊，是Collection接口中有iterator()方法，返回实现类对象
* Iterator<E> iterator() 返回在此collection的元素上进行迭代的迭代器
* */
public class Demo01Iterator {
    public static void main(String[] args) {
        /*
        * 迭代器的使用步骤
        * 1.使用集合中的方法iterator()获取迭代器的实现对象，使用Iterator接口接受（左接口右实现类，多态）
        * 2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
        * 3.使用Iterator接口中的方法next取出集合中的下一个元素*/

        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        /*
        * Iterator<E> 接口也是有泛型的，迭代器的泛型跟使用的集合的泛型相同
        * 左接口右实现类，多态*/
        Iterator<String> iterator = coll.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("=====================");

        for (Iterator<String> it2 = coll.iterator();it2.hasNext();) {
            String e = it2.next();
            System.out.println(e);
        }
    }
}
