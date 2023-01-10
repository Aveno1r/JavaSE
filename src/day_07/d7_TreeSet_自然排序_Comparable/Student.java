package day_07.d7_TreeSet_自然排序_Comparable;

public class Student implements Comparable<Student> {
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
        //this：正在添加的元素    o：集合中已添加过的元素
        //升序:this vs o
        //由于set集合可以去重复的,所以如果两个对象比较的结果是0.TreeSet集合就会认为两个对象是一样的。
        //需求:优先按照姓名的升序排,按照年龄的降序排列
        int rs= this.name.compareTo(o.name);
        //如果rs是0,就说明两个人的名字是一样的,进一步比较年龄
        //如果rs不是0,就说明两个人的名字是不一样的,直接通过姓名的顺序排序
        //if (rs==0){
        //    rs =o.age-this.age;
        //}else{
        //    rs=rs;
        //}
        rs= (rs==0?o.age-this.age:rs);
        return rs;
    }
}
