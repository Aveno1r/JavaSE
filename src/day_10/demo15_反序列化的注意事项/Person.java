package day_10.demo15_反序列化的注意事项;

import java.io.Serializable;

// Serializable序列化接口
public class Person implements Serializable {
    // 设置序列化版本号常量
    static final long serialVersionUID = 12L;

    private String name;
    private int age;
    //private String sex;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
