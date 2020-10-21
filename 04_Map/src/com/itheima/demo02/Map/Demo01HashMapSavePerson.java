package com.itheima.demo02.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        //show01();
        show02();
    }

    /*
    * HashMap存储自定义类型键值
    * key：Person类型
    *   因为键是Person类型，自定义的，重写hashCode和equals方法，保证key唯一
    * value：String类型
    *   value可以重复（同名同年龄视为同一个人）
    * */
    private static void show02() {
        HashMap<Person, String> map = new HashMap<>();
        //往集合中添加元素
        map.put(new Person("女王", 18), "英国");
        map.put(new Person("秦始皇", 18), "秦国");
        map.put(new Person("普京", 30), "俄罗斯");
        map.put(new Person("女王", 18), "毛里求斯");

        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person,String> entry : set) {
            System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
        }
    }

    /*
    * HashMap存储自定义类型键值，比如对象
    * key：String类型
    *   如果键是自定义类型，重写hashCode和equals方法，可以保证key唯一
    * value：Person类型
    *   value可以重复（同名同年龄视为同一个人）
    * */
    private static void show01() {
        HashMap<String, Person> map = new HashMap<>();
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",19));
        map.put("广州",new Person("王五",20));
        map.put("北京",new Person("赵六",18));

        //使用keySet加增强for遍历Map集合
        Set<String> sets = map.keySet();
        for(String set: sets) {
            Person p = map.get(set);
            System.out.println("key:"+set+"--->"+p);
        }
    }
}
