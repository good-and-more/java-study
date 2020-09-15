package cn.itcast.day09.demo14;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        GroupLeader leader = new GroupLeader("群主大哥", 100);

        GroupMember one = new GroupMember("路人甲", 0);
        GroupMember two = new GroupMember("路人乙", 0);
        GroupMember three = new GroupMember("路人丙", 0);

        leader.show();
        one.show();
        two.show();
        three.show();//先展示一下这四个人有多少钱
        System.out.println("========================");

//      群主总共发20块，分成3个红包
        ArrayList<Integer> redList = leader.send(20,3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        //再展示一下收完红包之后大家有多少钱
        leader.show();//应该剩下80
        one.show();
        two.show();
        three.show();

    }


}
