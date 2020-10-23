package com.itheima.demo04.MyException;

import java.util.Scanner;

/*
* 模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已存在
* */
public class Demo02RegisterException {
    //1.使用数组保存已注册过的用户名（数据库）
    static String[] usernames = {"张三","李四","王五"};

    public static void main(String[] args) {
        //2.使用Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名");
        String name = sc.next();
        checkUsername(name);
    }

    /*
    * 定义一个方法，对用户输入的用户名进行判断
    * */
    public static void checkUsername(String name) {
        for (String username : usernames) {
            if(name.equals(username)) {
                try {
                    throw new RegisterException("亲，该用户名已存在");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("恭喜您，注册成功");
    }
}
