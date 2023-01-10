package day_01.d16_继承_访问父类构造器_应用场景;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher("张三", 30, "讲java");
        System.out.println("t.getName() = " + t.getName());
        System.out.println("t.getAge() = " + t.getAge());
        System.out.println("t.getSkill() = " + t.getSkill());
    }
}
