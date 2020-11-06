package cn.itcast.reflect;

public class Demo01Reflect {
    public static void main(String[] args) throws Exception {
        //1.Clas.forName("全类名")
        Class cls1 = Class.forName("cn.itcast.reflect.Person");
        System.out.println(cls1);

        //2.类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);

        //3.对象.getClass()
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);
    }
}
