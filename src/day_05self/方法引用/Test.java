package day_05self.方法引用;

import day_05.d1_lambda入门.Swiming;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("张三", 24);
        students[1] = new Student("李四", 26);
        students[2] = new Student("王五", 26);
        students[3] = new Student("赵六", 23);

//        Comparator c = new Comparator<Student>(){
//
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        };
        //Lambda表达式写法
        Comparator<Student> c = (Student o1,Student o2)->{return o1.getAge() - o2.getAge(); };
        Arrays.sort(students,c);
        System.out.println("Arrays.toString(students) = " + Arrays.toString(students));
        //静态方法引用(格式 类名::方法名)  如果有一个静态方法,
        // 参数与lambda表达式重写的方法参数和返回值等都一致,
        // 可以直接使用这个静态方法,替换lambda表达式
        Arrays.sort(students,CompareDate::CompareAge);
        System.out.println("Arrays.toString(students) = " + Arrays.toString(students));
        //实例方法引用(格式 对象名::方法名)  如果有一个实例方法,
        // 参数与lambda表达式重写的方法参数和返回值等都一致,
        // 可以直接使用这个实例方法,替换lambda表达式
        CompareDate compareDate = new CompareDate();
        Arrays.sort(students,compareDate::CompareAge1);
        System.out.println("Arrays.toString(students) = " + Arrays.toString(students));
        //特定类型方法引用(格式 类名::方法名)
        // 默认将方法中的this,作为第一个参数,且方法中剩余的参数,
        // 与lambda表达式中的剩余参数一致,
        // 且返回值类型也一致。可以用该方法替换lambda表达式
        Arrays.sort(students,Student::compareTo);
        System.out.println("Arrays.toString(students) = " + Arrays.toString(students));
        //构造器引用(要创建的对象的类名::new)  如果有一个构造方法,
        // 参数与要使用的lambda重写方法的参数一致,
        // 且返回的类型就是该构造方法对应的类型,可以使用构造器引用
        Create create = new Create() {
            @Override
            public Student createStudent(String name, int age) {
                return new Student(name,age);
            }
        };
        //Lambda表达式
        Create create1 = (name,age) -> {return new Student(name,age);};
        Create create2 = (name,age) ->  new Student(name,age);

        //构造器引用
        Create create3 = Student::new;
        Student sx = create.createStudent("sx", 22);
        System.out.println("sx = " + sx);
    }
}
