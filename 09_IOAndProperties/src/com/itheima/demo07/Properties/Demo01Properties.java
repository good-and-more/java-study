package com.itheima.demo07.Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.Set;

/*
* Properties集合是唯一一个和IO流相结合的集合
* store方法，把集合中的临时数据，持久化写入到硬盘 OutputStream Writer
* load方法，把硬盘中保存的文件（键值对），读取到集合中使用 inputStream Reader
*
* Properties集合是一个双列集合，key和value默认都是字符串
* */
public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        //show01();
        //show02();
        show03();
    }

    /*
    * 存储键值对的文件中，键值默认连接符可以使用= 空格等
    * 存储键值对的文件中可以使用#注释，被注释的键值对不会读取
    * 键与值默认都是字符串，不再加引号
    * */
    private static void show03() throws IOException {
        //1.创建Properties集合对象，添加数据
        Properties prop = new Properties();
        FileReader fr = new FileReader("09_IOAndProperties\\g.txt");
        prop.load(fr);
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            System.out.println(prop.getProperty(key));
        }
    }

    private static void show02() throws IOException {
        //1.创建Properties集合对象，添加数据
        Properties prop = new Properties();
        prop.setProperty("赵丽颖", "168");
        prop.setProperty("迪丽热巴", "178");
        prop.setProperty("古力娜扎", "188");

        //2.创建字节输出流、字符输出流对象，构造方法中要绑定输出的目的地
        FileWriter fw = new FileWriter("09_IOAndProperties\\g.txt");
        //3.store方法
        prop.store(fw,"save data");
        //4.释放资源
        fw.close();
    }

    /*
    * 使用Properties集合存储数据，遍历Properties集合取出数据
    * Object setProperty(String key,String value)调用Hashtable的方法put
    * String getProterty(String key)通过key找到value值，相当于Map集合中的get(key)方法
    * Set<String> stringPropertyNames() 返回此属性列表中的键集，其中该键及其对应值是字符串，此方法相当于Map集合中的KeySet方法
    * */
    private static void show01() {
        Properties prop = new Properties();
        prop.setProperty("赵丽颖", "168");
        prop.setProperty("迪丽热巴", "178");
        prop.setProperty("古力娜扎", "188");

        //把Properties集合中的键取出，存储到一个Set集合中
        Set<String> set = prop.stringPropertyNames();

        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(value);
        }
    }
}
