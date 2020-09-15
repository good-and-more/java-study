package cn.itcast.day09.demo14;

import java.util.ArrayList;
import java.util.Random;

public class GroupMember extends User{
    public GroupMember() {

    }

    public GroupMember(String name,int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        //从多个红包中随便抽取一个给自己
        //随机获得一个集合当中的索引编号
        int index = new Random().nextInt(list.size());//匿名对象，使用一次就消失，例如list.size()是3，nextInt(3)是0,1,2,3左闭右开，在012中选
        //根据索引，从集合当中删除该红包，并将该红包存在自己这里
        int delta = list.remove(index);
        //当前成员本来有多少钱
        int money = super.getMoney();
        //加法，本身的钱加上拿到的红包，再放回去
        super.setMoney(money+delta);

    }
}
