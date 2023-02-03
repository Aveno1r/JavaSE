package day_14.demo4_获取类的成员变量以及操作成员变量;

public class Student {
    public String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
