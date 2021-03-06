package cn.itcast.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
* 描述需要执行的类名和方法名
* */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Pro {
    public abstract String className();
    public abstract String methodName();
}
/*
* public class ProImpl implements Pro{
*   public String className(){
*       return "cn.itcast.annotation.Demo01";
*   }
*
*   public String className(){
*       return "show";
*   }
* }
* */
