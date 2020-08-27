package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //向集合中添加元素add
        boolean success = list.add("柳岩");
        System.out.println(list);
        System.out.println(success);
        System.out.println(list.get(0));
        System.out.println(list.remove(0));
        System.out.println(list.size());

    }

}
