package cn.itcast.day09.demo14;

import java.util.ArrayList;

public class GroupLeader extends User{

    public GroupLeader(){

    }

    public GroupLeader(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int totalMoney,int count) {
        //首先，需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();
        //看一下群主有多少钱
        int leftMoney = super.getMoney();//群主当前余额
        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return redList;//返回空集合
        }
        //如果余额够，就扣钱，重新设置余额
        super.setMoney(leftMoney - totalMoney);
        //发红包需要平均拆分为count份
        int avg = totalMoney/count;//因为强制转换int，除的小数自动舍去小数部分变为整数
        int mod = totalMoney%count;//余数，剩余的零头
        for (int i = 0; i < count -1; i++) {
            redList.add(avg);
        }
        //最后一个红包单独处理
        int last = avg + mod;
        redList.add(last);
        return redList;
    }

}
