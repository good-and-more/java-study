package com.itheima.demo05.Consumer;

import java.util.function.Consumer;

public class Demo03Test {
    public static void printInfo(String[] arr, Consumer<String> con1,Consumer<String> con2) {
        for (String message:arr) {
            con1.andThen(con2).accept(message);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女","古力娜扎,女","马儿扎哈,男"};
        printInfo(arr,
                (message)->{
                    System.out.print(message.split(",")[0]);
        },
                (message)->{
                    System.out.println(message.split(",")[1]);
        });
    }
}
