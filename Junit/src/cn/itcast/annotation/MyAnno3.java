package cn.itcast.annotation;

import java.lang.annotation.*;

/**
 * 元注解：用于描述注解的注解
 * * @Target：描述注解能够作用的位置
 * * @Retention：描述注解被保留的阶段（Source，class，runtime）
 * * @Documented：描述注解是否被抽取到api文档中
 * * @Inherited：描述注解是否能被继承
 */
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})//表示MyAnno3注解只能作用于类上
@Retention(RetentionPolicy.RUNTIME)//表示当前被描述的注解会保留到class字节码文件中，被jvm读取到
@Documented//是否在javadoc中保留
@Inherited
public @interface MyAnno3 {
}
