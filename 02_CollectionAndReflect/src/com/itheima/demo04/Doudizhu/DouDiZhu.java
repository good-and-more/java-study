package com.itheima.demo04.Doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
* 斗地主综合案例
* 1.准备牌
* 2.洗牌
* 3.发牌
* 4.看牌
* */
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个是花色一个是数字，双循环用来产生扑克牌，逐一存入poker
        String[] colors = {"♠","♥","♣","♦"};
        String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
//        for (int i = 0; i < colors.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                poker.add(colors[i]+nums[j]);
//            }
//        }
        for (String color: colors) {
            for (String num: nums) {
                poker.add(color+num);
            }
        }
        poker.add("RedJoker");
        poker.add("BlackJoker");
        //System.out.println(poker.size());//生成54张牌完成

        //2.洗牌
        /*
        * 使用集合的工具类Collections中的方法
        * static void shuffle(List<?> list)
        * 使用默认随机源对指定列表进行置换
        * */
        Collections.shuffle(poker);//工具类的静态方法，直接用类.方法名调用
        System.out.println(poker);

        /*
        * 3.发牌
        * */
        //定义4个集合，存储玩家123手里拿到的牌，和三张底牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        /*
        * 遍历poker集合，获取每一张牌，使用集合的索引取模给三个玩家轮流发牌，剩余3张，即索引大于51时，三张底牌留下存入diPai
        * */
//        System.out.println(poker.get(0));
//        System.out.println(poker);

        for (int i = 0; i < poker.size(); i++) {
            if(i < 51) {
                switch(i%3){
                    case 0:
                        player1.add(poker.get(i));
                        break;
                    case 1:
                        player2.add(poker.get(i));
                        break;
                    case 2:
                        player3.add(poker.get(i));
                        break;
                    default:
                        break;
                }
            } else {
                diPai.add(poker.get(i));
            }
        }
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(diPai);
    }
}
