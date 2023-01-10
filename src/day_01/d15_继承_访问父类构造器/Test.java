package day_01.d15_继承_访问父类构造器;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        Student s2 = new Student("张三");
        Teacher t = new Teacher();
        Teacher t2 = new Teacher("李四");
    }
}
