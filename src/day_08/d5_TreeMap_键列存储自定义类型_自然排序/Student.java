package day_08.d5_TreeMap_键列存储自定义类型_自然排序;

public class Student  implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //this(正在添加元素)  o(已经添加元素)
        //this vs o 升序
        //TreeSet或者TreeMap排序,起到去重的效果。需要根据所有的属性内容,进行比较。
        //需求:优先按照姓名的升序排列,如果姓名相同,按照年龄的降序排列
        //int rs = this.name.compareTo(o.name);
        //rs= rs==0?o.age-this.age:rs;
        //return rs;
        return this.name.compareTo(o.name)==0?o.age-this.age:this.name.compareTo(o.name);
    }
}
