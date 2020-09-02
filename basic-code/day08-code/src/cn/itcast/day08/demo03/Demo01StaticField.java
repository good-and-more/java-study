package cn.itcast.day08.demo03;

public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("郭靖", 19);
        Student two = new Student("黄蓉", 16);

        one.setRoom("101教室");
        System.out.println(one.getName() + one.getAge() + one.getRoom() + one.getId());
        System.out.println(two.getName() + two.getAge() + two.getRoom() + two.getId());
    }
}
