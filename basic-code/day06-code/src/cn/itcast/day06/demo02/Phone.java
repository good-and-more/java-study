package cn.itcast.day06.demo02;

public class Phone {
    String brand;
    String color;
    double price;

    public void call(String who) {
        System.out.println("给"+who+"打电话");
    }

    public void sendMessage() {
        System.out.println("群发短信");
    }
}
