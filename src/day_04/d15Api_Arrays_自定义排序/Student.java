package day_04.d15Api_Arrays_自定义排序;
// 实现 Comparable<Student> 接口的排序方式成为自然排序
public class Student implements Comparable<Student> {
    private String name;
    private double hight;
    private int age;

    public Student() {
    }

    public Student(String name, double hight, int age) {
        this.name = name;
        this.hight = hight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", hight=" + hight +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //需求:假设按照年龄的升序比较
        //this vs  o  升序
        //if (this.age>o.age){
        //    return 1;//正数
        //}else if (this.age<o.age){
        //    return -1;//负数
        //}else{
        //    return 0;
        //}
        return this.age-o.age;
        //降序 o vs this
    }
}
