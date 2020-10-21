package com.itheima.demo01.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* 通过keyset方法获取map集合中的key，储存到set集合中，再遍历set集合，用get(key)的方式获取键对应的值
* */
public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);

        Set<String> strings = map.keySet();
        for (String string : strings) {
            Integer height = map.get(string);
            System.out.println("key:"+string+"=value:"+height);
        }

        System.out.println("华丽的分割线");

        //或者用迭代器
        Iterator<String> it = strings.iterator();
        while(it.hasNext()) {
            String key = it.next();
            Integer height = map.get(key);
            System.out.println("key:"+key+"=value:"+height);
        }
    }
}
