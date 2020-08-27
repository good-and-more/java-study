package cn.itcast.day07.demo05;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        int[] array = new int[]{123, 456, 789};
        System.out.println(Arrays.toString(array));
        list.add("123");
        list.add("456");
        list.add("789");
        System.out.println(list);
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i <= list.size()-1; i++) {
            if (i == (list.size() - 1)){
                System.out.print(list.get(i)+"}");
            } else {
                System.out.print(list.get(i)+"@");
            }
        }
    }
}
