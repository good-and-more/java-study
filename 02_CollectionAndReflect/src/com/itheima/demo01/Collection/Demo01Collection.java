package com.itheima.demo01.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
* java.util.Collection接口
*   所有单列集合的最顶层的接口，定义了所有单列集合的共性方法
*   共性的方法常用的如下：
* public boolean add（E e）：把给定的对象添加到当前集合中
* public boolean remove（E e）: 把给定的对象在当前集合中删除
* public boolean contains(E e): 判断当前集合中是否包含给定的对象
* public int size():返回集合中元素的个数
* public Object[] toArray():把集合中的元素存储到数组中
* public void clear()：清空集合中所有元素
* public boolean isEmpty():判断当前集合是否为空
* */
public class Demo01Collection {
    public static void main(String[] args) {
        //创建集合对象，可以使用多态，接口指向对应的实现类
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);//重写了toString方法

        //public boolean add（E e）：把给定的对象添加到当前集合中，返回值是一个boolean值
        boolean b1 = coll.add("张三");
        System.out.println("b1:" + b1);
        System.out.println(coll);
        coll.add("李四");
        coll.add("赵六");
        coll.add("田七");
        System.out.println(coll);

        /*
        * public boolean remove（E e）: 把给定的对象在当前集合中删除
        * */
        boolean b2 = coll.remove("赵六");
        System.out.println("b2: "+ b2);
        boolean b3 = coll.remove("王五");
        System.out.println("b3: "+ b3);

        /*
        * public boolean contains(E e):判断当前集合中是否包含给定的对象
        * */
        System.out.println("集合中是否包含赵六"+coll.contains("赵六"));
        System.out.println("集合中是否包含张三"+coll.contains("张三"));

        /*
        * public int size():返回集合中元素的个数
        * */
        int size = coll.size();
        System.out.println("集合中元素的个数为："+size);

        /*
        * public Object[] toArray():把集合中的元素存储到数组中,返回一个对象类型的数组，因为集合中什么类型都可以存，所以都转成对象
        * */
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /*
        * public void clear()：清空集合中所有元素,但是不删除集合
        * */
        boolean b4 = coll.isEmpty();
        System.out.println("b4:"+b4);
        coll.clear();
        System.out.println(coll);
        /*
        * public boolean isEmpty():判断当前集合是否为空
        * */
        boolean b5 = coll.isEmpty();
        System.out.println("b5:"+ b5);
    }

}