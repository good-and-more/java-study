package cn.itcast.annotation;

public @interface MyAnnotation {
    //要求属性的返回值类型是基本数据类型、字符串、枚举、注解、以上类型的数组

    int value();//基本数据类型
    public abstract String name() default "张三";//字符串
    Person per();//枚举
    MyAnno2 anno2();//注解
    String[] strs();//以上类型的数组
    //Worker w();//会报错，只能上述类型，不能自定义返回类型


}
