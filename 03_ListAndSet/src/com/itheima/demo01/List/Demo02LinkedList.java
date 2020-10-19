package com.itheima.demo01.List;

import java.util.LinkedList;

/*java.util.LinkedList集合 implements List接口
* LinkedList集合的特点：
*   1.底层是一个链表结构，查询慢，增删快
*   2.包含了大量操作首尾元素的方法
*   注意，使用LinkedList集合特有的方法，不能使用多态
*   addFirst,addLast,push,
*   getFirse,getLast,
*   removeFirst,removeLast,pop,
*   isEmpty
*
* */
public class Demo02LinkedList {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.addFirst("a");
        strings.addLast("c");
        strings.push("a");//push约等于addFirst
        System.out.println(strings);

        //只获取，不移除
        System.out.println(strings.getFirst());
        System.out.println(strings.getLast());
        System.out.println(strings);

        //获取并移除
        System.out.println(strings.removeFirst());
        System.out.println(strings.removeLast());
        System.out.println(strings.pop());//pop相当于removeFirst
        System.out.println(strings);

        //判断是否为空
        boolean isEmpty = strings.isEmpty();
        System.out.println(isEmpty);
        strings.pop();
        strings.pop();
        strings.pop();
        //如何全部清空呢？
        System.out.println(strings.isEmpty());
    }
}
