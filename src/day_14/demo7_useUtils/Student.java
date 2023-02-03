package day_14.demo7_useUtils;

public class Student {
    private String name;
    private int age;
    private char sex;
    private double height;
    private String hobby;

    public Student(String name, int age, char sex, double height, String hobby) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.hobby = hobby;
    }

    // set\get...

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", height=" + height +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
