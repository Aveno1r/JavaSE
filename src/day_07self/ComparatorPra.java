package day_07self;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class ComparatorPra {
    public static void main(String[] args) {
//匿名内部类 重写Comparator的compare方法
//        Comparator c = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                int r = o2.getName().compareTo(o1.getName());
//                r = (r == 0 ? o1.getAge() - o2.getAge() : r);
//                return r;
//            }
//        };
        //匿名内部类直接做TreeSet<Student>(Comparator<? super E> comparator)的参数
        TreeSet<Student> students = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int r = o2.getName().compareTo(o1.getName());
                r = (r == 0 ? o1.getAge() - o2.getAge() : r);
                return r;
            }
        });

        //Lambda表达式
//        TreeSet<Student> students = new TreeSet<>((o1,o2) ->{
//            int r = o2.getName().compareTo(o1.getName());
//            r = (r == 0 ? o1.getAge() - o2.getAge() : r);
//            return r;
//            });

        students.add(new Student("zhangsan", 18));
        students.add(new Student("lisi", 20));
        students.add(new Student("zhangsan", 18));
        students.add(new Student("lisi", 18));
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
