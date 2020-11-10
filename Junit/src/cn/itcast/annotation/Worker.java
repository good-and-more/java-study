package cn.itcast.annotation;

@MyAnnotation(value = 1, per = Person.p1, anno2 = @MyAnno2, strs = {"abc", "edf"})
@MyAnno3
public class Worker {

    @MyAnno3
    private String name;

    @MyAnno3
    public void show(){

    }
}
