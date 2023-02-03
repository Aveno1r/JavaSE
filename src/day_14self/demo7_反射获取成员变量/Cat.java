package day_14self.demo7_反射获取成员变量;

public class Cat {
    private String name;

    private int age;

    private String address;

    public Cat() {
        System.out.println("空参运行了");
    }

    public Cat(String name, int age) {
        System.out.println("有参运行了");
        this.name = name;
        this.age = age;
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
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
