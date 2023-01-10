package day_01.d17_继承_访问本类构造器;

public class Student {
    private String name;
    private int age;
    private int number;

    public Student() {
    }

    public Student(String name, int age) {
        //super();
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, int number) {
        //this.name = name;
        //this.age = age;
        this(name, age);
        //super();//this调用构造器和super调用构造器不能共存。
        this.number = number;
    }


}
