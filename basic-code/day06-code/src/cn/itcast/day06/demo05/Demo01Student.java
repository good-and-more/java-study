package cn.itcast.day06.demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu01 = new Student();
        stu01.setName("迪丽热巴");
        stu01.setAge(20);
        System.out.println("我叫"+stu01.getName()+",我今年"+stu01.getAge()+"岁");

        Student stu02 = new Student("古力娜扎", 21);
        System.out.println("我叫"+stu02.getName()+",我今年"+stu02.getAge()+"岁");
    }
}
