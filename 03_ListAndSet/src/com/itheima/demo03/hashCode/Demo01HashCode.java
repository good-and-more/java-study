package com.itheima.demo03.hashCode;

public class Demo01HashCode {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.hashCode());
        System.out.println(p1);
        System.out.println(p2.hashCode());
        System.out.println(p2);

        /*
        * String类的hash值
        *   String类重写了Object类的hashCode方法，同样的字符串hashcode相同，例外，中文重地和通话，hash冲突，元素不同hash值相同
        * */
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
}
