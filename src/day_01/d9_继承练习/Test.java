package day_01.d9_继承练习;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("张三");
        t.setSkill("讲java");
        System.out.println("t.getName() = " + t.getName());
        System.out.println("t.getSkill() = " + t.getSkill());

        Consultant cs = new Consultant();
        cs.setName("李四");
        cs.setNumber(100);
        System.out.println("cs.getName() = " + cs.getName());
        System.out.println("cs.getNumber() = " + cs.getNumber());
    }
}
