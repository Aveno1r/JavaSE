package day_04.d15Api_Arrays_自定义排序;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        //定义数组,存储学生对象
        Student[] students = new Student[4];
        students[0] = new Student("蜘蛛精", 169.5, 23);
        students[1] = new Student("紫霞", 163.8, 26);
        students[2] = new Student("紫霞", 163.8, 26);
        students[3] = new Student("至尊宝", 167.5, 24);

        System.out.println("Arrays.toString(students) = " + Arrays.toString(students));
        //如果我们没有告诉排序工具,排序的规则,底层就会报错。
        //Arrays.sort(students);//java.lang.ClassCastException: Student cannot be cast to java.lang.Comparable
        //sort方法,底层会不断遍历数组,将数组中的元素(对象)传递给底层的方法,进行两两元素之间的比较。


        //希望,自己定义任意类的比较规则,使用比较器排序
        //public interface Comparator<T> { int compare(T o1, T o2); }
        //Arrays.sort(T[] t,Comparator c);
        Comparator c = new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                //o1 vs o2 升序
                //排序规则 按照年龄的降序排列
                return o2.getAge()-o1.getAge();
            }
        };
        Arrays.sort(students,c);
        System.out.println("Arrays.toString(students) = " + Arrays.toString(students));

    }
}
