package cn.itcast.day06.demo03;

public class Demo02Method {
    public static void main(String[] args) {
        int[] array = new int[] {5,10,15,20,100};
        int max = getMax(array);
        System.out.println("最大值是"+max);
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = max < array[i] ? array[i] : max;
        }
        return max;
    }


}
