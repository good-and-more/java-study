package com.itheima.demo01.Exception;
/*
* throw关键字，可以在指定方法中抛出指定的异常
* 使用格式
*   throw new xxxException（“异常产生的原因”）;
*   注意，1.必须写在方法内部
*        2.new的对象必须是Exception或者Exception的子类
*        3.throw关键字抛出指定的异常对象，我们必须处理这个异常
*           创建的是RuntimeException或者其子类，可以不处理，默认交给JVM处理，打印异常对象，终端程序
*           是编译异常，则必须处理，要么throws，要么try...catch
* */
public class Demo03Throw {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int e = getElement(arr,2);
        System.out.println(e);
    }


    /*
    * 定义一个方法获取数组指定索引处的元素
    * 参数
    * int[] arr
    * int index
    * @return int ele;
    * 工作中首先必须对方法传递过来的参数进行合法性校验
    * 如果不合法，必须用抛出异常的方式告知方法的调用者，传递的参数有问题
    * */
    public static int getElement(int[] arr,int index) {
        /*
        * 校验数组参数，如果数组值是null，就抛出空指针异常
        * */
        if(arr == null) {
            throw new NullPointerException("传递的数组的值是null");//NullPointerException是运行期异常，交给JVM处理
        }
        /*
         * 校验索引，如果索引不在数组索引范围内，就抛出索引越界异常
         * */
        if(index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("传递的索引超出了数组的使用范围");
        }
        int ele = arr[index];
        return ele;
    }
}
