package cn.itcast.day10.demo06;
/*
* 如何才能知道一个父类引用的对象本来是什么子类？
* 格式： 对象 instanceof 类名称
* 得到一个boolean值结果，判断前面的对象能不能当作后面类型的实例
* */
public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Cat();//本来是一只猫
        animal.eat();//输出猫吃鱼
        //如果需要用子类特有方法，需要向下转型
        giveMeAPet(animal);

    }

    public static void giveMeAPet(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
