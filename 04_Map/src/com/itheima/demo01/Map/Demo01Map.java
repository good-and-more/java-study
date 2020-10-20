package com.itheima.demo01.Map;

import java.util.HashMap;
import java.util.Map;

/*
* java.util.Map<k,v>集合
* 1.Map集合是一个双列集合，一个元素包括两个值key和value
* 2.Map集合中的元素，key和value的数据类型可以相同也可以不同
* 3.Map集合中的元素，key不允许重复，value可以重复
* 4.Map集合中的元素，key和value一一对应
*
* java.util.HashMap<k,v>集合 implements Map<k,v>接口
*   1.HashMap集合底层是哈希表，查询速度快
*       JDK1.8之前是数组+单向链表
*       JDK1.8之后是数组+单向链表/红黑树(链表长度超过8)
*   2.HashMap集合是一个无序的集合，存储元素和取出元素的顺序可能不一致
* java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
*   1.LinkedHashMap是哈希表+链表，保证迭代的顺序
*   2.LinkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序是一致的
* */
public class Demo01Map {
    public static void main(String[] args) {
        //show01();
        show02();
    }



    private static void show02() {
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);
        Integer v1 = map.remove("林志玲"); //用Integer int基本数据类型无法接收null会报错
        System.out.println(map);
        System.out.println(v1);
        System.out.println(map.get("林志颖"));//不存在的key会返回null
        System.out.println(map.containsKey("林志颖"));
    }

    /*public V put(K key,V value)： 把指定的键与指定的值添加到Map集合
        返回值V：存储键值对的时候，key不重复，返回V是null
        key重复，使用传入的value替换原有的，并返回
    * */
    private static void show01() {
        Map<String,String> map = new HashMap<>();

        String v1 = map.put("李晨", "范冰冰");
        System.out.println("v1"+v1);
        String v2 = map.put("李晨", "范冰冰1");
        System.out.println("v2"+v2);

        System.out.println(map);

        map.put("冷风", "龙小云");
        map.put("杨过", "小龙女");
        map.put("尹志平", "小龙女");
        System.out.println(map);

    }
}
