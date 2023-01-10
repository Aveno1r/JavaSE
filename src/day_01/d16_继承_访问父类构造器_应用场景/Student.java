package day_01.d16_继承_访问父类构造器_应用场景;

public class Student  extends People{
    private String number;

    public Student() {
    }

    public Student(String name, int age, String number) {
        super(name, age);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
