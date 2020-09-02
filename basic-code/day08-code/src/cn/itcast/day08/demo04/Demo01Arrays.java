package cn.itcast.day08.demo04;

import java.util.Arrays;

//数据工具类Arrays
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        int[] array1 = {2, 1, 3, 8, 5};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
    }
}
