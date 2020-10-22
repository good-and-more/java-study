package com.itheima.demo06.DoudizhuAdvance;

import java.util.*;

public class Demo01Doudizhu {
    public static void main(String[] args) {
        /*
        * 斗地主综合案例，带顺序的版本
        * 1.先准备牌
        * */
        //因为已知需要添加元素，且添加后不再增删，额可以使用of，但是是JDK1.9之后的内容，现在无法使用
        List<String> colors = Arrays.asList("♠","♥","♣","♦");
        List<String> numbers = Arrays.asList("2","A","K","Q","j","10","9","8","7","6","5","4","3");
        List<Integer> pokerKey = new ArrayList<>();
        Map<Integer, String> poker = new HashMap<>();
        int key = 0;
        for(String number : numbers) {
            for(String color : colors) {
                pokerKey.add(key);
                poker.put(key,color + number);
                key++;
            }
        }
        poker.put(key, "小王");
        pokerKey.add(key);
        poker.put(++key, "大王");
        pokerKey.add(key);
        //2.准备牌完了洗牌
        Collections.shuffle(pokerKey);

        /*
        * 3.发牌，先定义四个集合，三个玩家和一个底牌,集合存储的是牌的索引，不是牌本身，所以是Integer
        * */
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        //遍历pokerKey，获取每一张牌的索引
        for(int i = 0; i < pokerKey.size(); i++) {
            if (i >= 51){
                diPai.add(pokerKey.get(i));
            } else if (i%3 == 0) {
                player01.add(pokerKey.get(i));
            } else if (i%3 == 1) {
                player02.add(pokerKey.get(i));
            } else if (i%3 == 2) {
                player03.add(pokerKey.get(i));
            }
        }
//        System.out.println(diPai);
//        System.out.println(player01);
//        System.out.println(player02);
//        System.out.println(player03);
        /*
        * 4.码牌，每位选手把自己的牌顺序整理好，按从小到大的顺序
        * */
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);
        /*
        * 5,看牌，定义一个看牌的方法
        * 参数：
        *   String name：玩家名称
        *   HashMap<Integer,String> poker:存储牌的poker集合
        *   ArrayList<Integer> list:存储玩家和底牌的list集合
        *
        * 使用查表法：遍历玩家和底牌集合，获取牌的索引，再使用牌的索引，去Map集合中找到对应的牌
        * */
        lookPoker("刘德华",poker,player01);
        lookPoker("周润发",poker,player02);
        lookPoker("周星驰",poker,player03);
        lookPoker("底牌",poker,diPai);


    }

    public static void lookPoker(String name,Map<Integer,String> poker,ArrayList<Integer> list) {
        //输出玩家名字，不换行
        System.out.print(name+":  ");
        for (Integer key : list) {
            String value = poker.get(key);
            System.out.print(value+" ");
        }
        System.out.println();
    }

}
