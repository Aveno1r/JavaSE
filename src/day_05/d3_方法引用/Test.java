package day_05.d3_方法引用;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        //定义一个长度为4的,存储学生的数组
        Student[] stus = new Student[4];
        //存储学生对象(匿名对象)
        stus[0] = new Student("张三", 24);
        stus[1] = new Student("李四", 26);
        stus[2] = new Student("王五", 26);
        stus[3] = new Student("赵六", 23);


        //排序
        //Comparator c=  new Comparator<Student>(){
        //
        //    @Override
        //    public int compare(Student o1, Student o2) {
        //        //年龄升序排序
        //        return o1.getAge()-o2.getAge();
        //    }
        //};
        //Comparator<Student> c = (Student o1, Student o2)->{ return o1.getAge()-o2.getAge();};
        //Arrays.sort(stus,c);
        Arrays.sort(stus, (Student o1, Student o2) -> {
            return o1.getAge() - o2.getAge();
        });


        //静态方法引用(格式 类名::方法名)  如果有一个静态方法,参数与lambda表达式重写的方法参数和返回值等都一致,可以直接使用这个静态方法,替换lambda表达式
        //Arrays.sort(stus, (Student o1, Student o2) -> {
        //    return CompareDate.compare1(o1,o2);
        //});
        //Arrays.sort(stus,CompareDate::compare1);

        //实例方法引用(格式 对象名::方法名)  如果有一个实例方法,参数与lambda表达式重写的方法参数和返回值等都一致,可以直接使用这个实例方法,替换lambda表达式
        CompareDate date = new CompareDate();
        //Arrays.sort(stus,date::compare2);

        //特定类型方法引用(格式 类名::方法名)
        // 默认将方法中的this,作为第一个参数,且方法中剩余的参数,与lambda表达式中的剩余参数一致,
        // 且返回值类型也一致。可以用该方法替换lambda表达式
        Arrays.sort(stus, Student::compareTo);
        System.out.println("Arrays.toString(stus) = " + Arrays.toString(stus));


        //构造器引用(要创建的对象的类名::new)  如果有一个构造方法,参数与要使用的lambda重写方法的参数一致,且返回的类型就是该构造方法对应的类型,可以使用构造器引用
        //Create create =new Create() {
        //    @Override
        //    public Student create(String name, int age) {
        //        return new Student(name,age);
        //    }
        //};
        //Create create =(String name, int age)->{ return new Student(name,age);};
        //Create create = (name, age) -> new Student(name, age);
        Create create = Student::new;


        Student s = create.create("张三", 18);
        System.out.println("s = "+s);
}
}
