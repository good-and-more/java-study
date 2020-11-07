package cn.itcast.annotation;

@MyAnnotation(value=1,per=Person.p1,anno2=@MyAnno2,strs={"abc","edf"})
public class Worker {
}
