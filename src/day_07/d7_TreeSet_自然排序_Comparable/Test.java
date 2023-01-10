package day_07.d7_TreeSet_自然排序_Comparable;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
         TreeSet<Student> ts3 = new TreeSet<>();

        ts3.add(new Student("zhangsan",18));
        ts3.add(new Student("lisi",20));
        ts3.add(new Student("zhangsan",17));
        ts3.add(new Student("lisi",18));

        for (Student s : ts3) {
            System.out.println("s = " + s);
        }
    }
}
