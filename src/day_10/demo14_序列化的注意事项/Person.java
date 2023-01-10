package day_10.demo14_序列化的注意事项;

import java.io.Serializable;

// Serializable序列化接口
public class Person implements Serializable {
    private String name;
    private transient int age;// age属性不想被序列化,使用transient关键字修饰
    private Pet pet;// 宠物

    public Person(String name, int age, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }
}
