package com.itheima.demo03.Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
        //show01();
        show02();
    }

    /*
    * 创建集合对象，使用泛型
    * 好处
    * 1.避免类型转换的麻烦，存储的是什么类型，取出的是什么类型，
    * 2.把运行期异常提到了编译期
    * */
    private static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        //list.add(2);//直接报错，不让存
        list.add("123");//直接报错，不让存

        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            String s = it.next();
            System.out.println(s+"->"+s.length());
        }
    }

    /*
    * 创建集合对象，不使用泛型，默认的类型就是Object类型，可以存储任意类型的数据
    * */
    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);
        Iterator it = list.iterator();
        //使用迭代器的方法hasNext和next遍历集合，取出的元素也是Object
        while(it.hasNext()) {
            Object obj = it.next();//因为创建时没有加String，可以储存任意类型的数据，所以取出时必须用obj来接收，左obj，右String或Integer,多态
            System.out.println(obj);


            //想要使用String类特有的方法length获取字符串长度：多态Object obj = ”abc“，不能使用子类特有的方法；
            //需要向下转型
            //会抛出ClassCastException，不能把Integer类型转换为String类型
            String s = (String) obj;
            //System.out.println(s.length());
        }

    }
}
