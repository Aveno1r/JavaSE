package day_08.d5_TreeMap_键列存储自定义类型_自然排序;

import java.util.Set;
import java.util.SplittableRandom;
import java.util.TreeMap;

public class Test01 {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<>();
        tm.put(new Student("zhangsan", 18), "北京");
        tm.put(new Student("lisi", 20), "北京");
        tm.put(new Student("zhangsan", 18), "北京");
        tm.put(new Student("zhangsan", 20), "北京");
        Set<Student> students = tm.keySet();
        for (Student student : students) {
            String value = tm.get(student);
            System.out.println(student + "" + value);
        }
    }
}
