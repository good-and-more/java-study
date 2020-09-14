package cn.itcast.day09.demo07;

public class Zi extends Fu {
    public Zi() {
        //super();//不报错，因为默认赠送一个super()构造调用，在父类中补齐无参构造方法后可以调用
        super(10);//传入参数10，父类中同名方法不同参数列表，发生了方法重载，可以通过super(参数)来调用重载方法
        System.out.println("子类构造方法");

    }

    public void method() {
        //super();只有子类构造方法能调用父类构造方法，不能在普通方法中调用
    }
}
