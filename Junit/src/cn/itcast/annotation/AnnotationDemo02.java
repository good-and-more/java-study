package cn.itcast.annotation;

/**
 * * @Override：检测被该注解标注的方法是否是继承自父类，正规重写
 *     * @Deprecated：该注解标注的内容已过时
 *     * @SuppressWarnings：压制警告
 */
@SuppressWarnings("all")//使用SuppressWarnings需要传参，一般传all，压制所有警告
public class AnnotationDemo02 {
    @Override
    public String toString(){
        return super.toString();
    }

    @Deprecated
    public void show1(){
        //有缺陷
    }

    @SuppressWarnings("all")
    public void show2(){
        //新版本，替代show1方法
    }

    @MyAnnotation
    public void show3(){
        //自定义注解
    }
    public void method(){
        show1();
    }
}
