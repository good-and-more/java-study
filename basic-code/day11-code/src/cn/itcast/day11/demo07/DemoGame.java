package cn.itcast.day11.demo07;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");//设置英雄的名称
        //设置英雄技能
        //hero.setSkill(new SkillImpl());//Skill是接口，左接口右实现类 多态
        //还可以使用匿名内部类
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("piapiapia");
//            }
//        };
//        hero.setSkill(skill);

        //同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("shuashuashua");
            }
        });
        hero.attack();
    }
}
