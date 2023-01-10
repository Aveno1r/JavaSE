package day_02.d17_匿名内部类_应用;

public class Cat implements Swiming {
    String name = "猫";

    @Override
    public void swim() {
        System.out.println(name + "飘在水面上游泳...");
    }
}
