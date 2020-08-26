package cn.itcast.day06.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.showSelf();

        person.name = "赵丽颖";
        person.setAge(120);
        person.showSelf();
    }
}
