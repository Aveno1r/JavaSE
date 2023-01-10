package day_07.d2_set_哈希值;

import day_05self.方法引用.Student;

import java.util.Date;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        //不同的对象,哈希值可能相同的
        //如果两个对象的哈希值不同,两个对象肯定不同。
        System.out.println("\"Aa\".hashCode() = " + "Aa".hashCode());
        System.out.println("\"BB\".hashCode() = " + "BB".hashCode());

        Student s1 = new Student("沈潇", 22);
        Student s2 = new Student("沈潇1", 23);
        System.out.println("s1.hashCode() = " + s1.hashCode());
        System.out.println("s2.hashCode() = " + s2.hashCode());
    }
}
