package com.itheima.demo04.MyException;
/*
* 自定义异常类
*   java提供的异常类不够使用，需要自己定义一些异常类
* 格式：
*   public class XXXException extends Exception或者RuntimeException{
*       添加一个空参数的构造方法和一个带异常信息的构造方法
*   }
*
* 注意：
*   1.自定义异常类一般都是Exception结尾，说明该类是个异常类
*   2.自定义异常类必须继承Exception或者RuntimeException
*       继承Exception是一个编译器异常，如果方法内部抛出了编译器异常，就必须处理，要么throws，要么trycatch
*       继承RuntimeException：那么自定义异常类就是一个运行期异常，无需处理，交给虚拟机处理（中断）
* */
public class RegisterException extends RuntimeException{
    //添加一个空参数构造方法
    public RegisterException(){}
    //添加一个带异常信息的构造方法

    public RegisterException(String message) {
        super(message);
    }

}
