package day_01.d15_继承_访问父类构造器;

public class Student extends People {
    private String name = "学生";

    public Student() {
        //super();
        super("");
        System.out.println("Student 无参构造");
    }

    public Student(String name) {
        //super();
        super("");
        System.out.println("Student 有参构造");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
