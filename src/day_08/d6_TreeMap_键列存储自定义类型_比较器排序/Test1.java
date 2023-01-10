package day_08.d6_TreeMap_键列存储自定义类型_比较器排序;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
       Comparator c =  new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o1.getName().compareTo(o2.getName());
                i = i == 0 ? o2.getAge() - o1.getAge() : i;
                return i;
            }
        };
        TreeMap tm = new TreeMap<Student,String>(c);
        tm.put(new Student("zhangsan", 18), "北京");
        tm.put(new Student("lisi", 20), "北京");
        tm.put(new Student("zhangsan", 18), "北京");
        tm.put(new Student("zhangsan", 20), "北京");
        Set<Student> set = tm.keySet();
        for (Student student : set) {
           String value = (String) tm.get(student);
            System.out.println( student + " " + value);
        }
    }
}
