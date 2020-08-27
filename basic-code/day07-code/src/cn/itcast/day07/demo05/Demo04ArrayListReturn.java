package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> listA = new ArrayList<>();
        //获取一个随机数对象，再获取一个ArrayList集合，用于存放20个随机数
        for (int i = 0; i < 20; i++) {
            listA.add(r.nextInt(100) + 1);//从0到99变为1到100
        }
        System.out.println(listA);
        //调用筛选方法，将大集合中的偶数放入小集合，方法返回小集合
        ArrayList<Integer> listB = getSmallArrayList(listA);
        System.out.println(listB);
    }

    public static ArrayList<Integer> getSmallArrayList(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                result.add(list.get(i));
            }
        }
        return result;
    }
}
