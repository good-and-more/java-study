package cn.itcast.day06.demo03;

public class Person {
    String name;
    private int age;

    public void showSelf() {
        System.out.println("我叫"+name+",今年"+age+"岁");
    }

    public void setAge(int num) {
        if(num < 100 && num >=0) {
            age = num;
        } else {
            System.out.println("年龄设置不合理，必须在0到100之间");
        }

    }

    public int getAge() {
        return age;
    }
}
