package cn.itcast.day07.demo02;
import cn.itcast.day07.demo02.Person;
//匿名对象就是只有右边的对象，没有左边的名字和赋值
//匿名对象只能使用唯一的一次，因为没有存地址，再想用找不到它了
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "高圆圆";
        one.showName();
        System.out.println("===============");

        //匿名对象
        new Person().name = "赵又廷";
        new Person().showName();//返回null，因为匿名对象又重新new了一个
    }
}
