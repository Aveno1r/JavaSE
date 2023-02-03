package day_14self.demo6_反射获取类的构造器;

public class Cat {
    private String name;

    private int age;

    public Cat() {
        System.out.println("无参构造执行了");
    }

    private Cat(String name, int age) {
        System.out.println("有参构造执行了");
        this.name = name;
        this.age = age;
    }
}
