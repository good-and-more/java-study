package cn.itcast.day07.demo04;
import java.util.ArrayList;
//如果希望在集合ArrayList中存储基本数据类型，必须使用基本类型对应的包装类
//Byte Short Integer Long Float Double Character Boolean
public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        //错误写法，泛型只能是引用类型，不能是基本类型,因为集合里保存的是地址值，基本数据类型没有地址值
        //ArrayList<int> listB = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(100);
        listB.add(200);
        System.out.println(listB.get(0));
    }

}
