package cn.itcast.day11.demo06;
/*
* 类作为成员变量类型
* 游戏当中的英雄角色类
*
* */
public class Hero {
    private String name;//英雄名，其实也是字符串对象
    private Weapon weapon;//武器对象作为成员变量
    private int age;

    public Hero() {
    }

    public Hero(String name, Weapon weapon, int age) {
        this.name = name;
        this.weapon = weapon;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void attack() {
        System.out.println("年龄为"+age+"的"+name+"用"+this.weapon.getCode()+"攻击敌方");
    }
}
