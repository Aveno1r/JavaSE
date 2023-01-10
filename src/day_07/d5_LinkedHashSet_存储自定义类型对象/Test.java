package day_07.d5_LinkedHashSet_存储自定义类型对象;

import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
        //LinkedHashSet是存取有序的集合(原因底层采用双向链表)  剩下的和HashSet一模一样
        LinkedHashSet<Student> hs  = new LinkedHashSet<>();

        hs.add(new Student("李四",20));
        hs.add(new Student("张三",18));
        hs.add(new Student("张三",18));

        //System.out.println("hs = " + hs);
        for (Student s : hs) {
            System.out.println("s = " + s);
        }
    }
}
