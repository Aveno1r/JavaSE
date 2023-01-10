package day_03.d13_常用API_Objects;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //重写equals方法,比较两个对象是否相同


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        //IDEA生成equals方法的时候,可以通过使用Objects中的equals方法,避免控制针异常。
        return age == student.age &&
                Objects.equals(this.name, student.name);
        // Objects.equals源码
        // public static boolean equals(Object a, Object b) {
        //        return (a == b) || (a != null && a.equals(b));
        //    }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
