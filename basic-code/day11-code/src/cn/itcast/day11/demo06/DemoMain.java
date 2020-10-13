package cn.itcast.day11.demo06;
/*
* 创建一个英雄角色*/
public class DemoMain {
    public static void main(String[] args) {
        //Hero hero = new Hero("伊利丹", new Weapon("霜之哀伤"), 25);
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setAge(20);

        //创建一个武器对象
        Weapon weapon = new Weapon("多兰剑");
        hero.setWeapon(weapon);
        //年龄为20的盖伦用多兰剑攻击敌方
        hero.attack();

    }
}
