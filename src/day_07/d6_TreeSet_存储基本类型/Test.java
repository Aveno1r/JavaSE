package day_07.d6_TreeSet_存储基本类型;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(3);
        ts.add(1);
        ts.add(2);
        System.out.println("ts = " + ts);


        TreeSet<String> ts2 = new TreeSet<>();

        ts2.add("b");
        ts2.add("a");
        ts2.add("c");
        System.out.println("ts2 = " + ts2);

        TreeSet<Student> ts3 = new TreeSet<>();
        //报错原因:TreeSet可以进行排序的集合,如果没有提供排序规则,它就会在添加元素的时候报错。
        ts3.add(new Student("张三",18));//java.lang.ClassCastException: Student cannot be cast to java.lang.Comparable
        ts3.add(new Student("李四",20));
        ts3.add(new Student("张三",18));

        Comparator c = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int rs = o2.getName().compareTo(o1.getName());
                rs=(rs==0?o1.getAge()-o2.getAge():rs);
                return rs;
            }
        };


        for (Student s : ts3) {
            System.out.println("s = " + s);
        }
    }
}
