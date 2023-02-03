package day_14.demo2_获取类的字节码对象;

public class Student implements C,D{
    private String name;
    private int age;
    // ...


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

interface A{}
interface B extends A{}
interface C extends B{}
interface D{}
