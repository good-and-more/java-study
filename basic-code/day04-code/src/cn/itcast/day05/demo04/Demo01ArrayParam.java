package cn.itcast.day05.demo04;

public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = new int[]{10, 20, 30, 40, 50};
        printArray(array);
        System.out.println("===AAA===");
        printArray(array);
        System.out.println("===BBB===");
        printArray(array);
    }

    public static void printArray(int[] array) {
        System.out.println("方法传进来的参数是"+array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
