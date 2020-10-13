package com.itheima.demo02.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* java.text.DateFormat 格式化日期到文本，解析文本到日期，
* 用成员方法
* String format(Date date) 格式化
* Date parse(String source) 解析
* DateFormat是抽象类，无法直接创建使用，可以使用DateFormat子类
* java.text.simpleDateFormat extends DateFormat
* 构造方法 SimpleDateFormat(String pattern)
*   用给定的模式和默认语言环境的日期格式符号构造SimpleDateFormat
* 参数
* String pattern:传递指定的模式，例如“yyyy-MM-dd HH:mm:ss”
*
* */
public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }

    /*解析，使用DateFormat类中的方法parse，把文本解析为日期
    *使用步骤
    * 1.创建SimpleDateFormat对象，构造方法中传递指定的模式
    * 2.调用SimpleDateFormat对象中的方法parse,把符合构造方法中模式的字符串，解析为Date日期
    */
    private static void demo02() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = simpleDateFormat.parse("2020年10月13日 21时13分13秒");
        System.out.println(date);
    }

    /*
    * 使用DateFormat类中的方法format，把日期格式化为文本
    * 1.创建SimpleDateFormat对象，构造方法中传递指定的模式
    * 2.调用SimpleDateFormat对象中的方法format，按照构造方法中指定的模式把Date日期格式化为符合模式的字符串
    * String format(Date date)*/
    private static void demo01() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String d = simpleDateFormat.format(date);
        System.out.println(date);
        System.out.println(d);
    }


}
