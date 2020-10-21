package com.itheima.demo03.LinkedHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Demo03MapTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scanner.next();
        //获取了输入的字符串
        //2.创建map集合，key是字符串中的字符，value是字符的个数
        HashMap<Character, Integer> map = new HashMap<>();
        //3.遍历字符串，获取每一个字符
        for (char c:str.toCharArray()) {
            //4.通过key是否存在来判断出现了几次
            if(map.containsKey(c)) {
                Integer value = map.get(c);
                //value++;
                map.put(c, ++value);//一定要++在前面，因为
            } else {
                map.put(c, 1);
            }
        }

        //5.遍历map集合，输出结果
        //尝试用Entry对象来输出
        Set<HashMap.Entry<Character,Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
