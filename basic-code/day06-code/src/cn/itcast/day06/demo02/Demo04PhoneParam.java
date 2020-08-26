package cn.itcast.day06.demo02;
import cn.itcast.day06.demo02.Phone;

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "土豪金";
        method(one);//传递进去的其实是堆中对象one的地址值
    }

    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
