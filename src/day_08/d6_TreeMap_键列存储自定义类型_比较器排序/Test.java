package day_08.d6_TreeMap_键列存储自定义类型_比较器排序;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        //public TreeMap(Comparator<? super K> comparator)
        //Comparator c= new Comparator<Student>(){
        //
        //    @Override
        //    public int compare(Student o1, Student o2) {
        //        //o1表示正在添加  o2表示已经添加
        //        //升序:o1 vs o2
        //        //需求:优先按照姓名的升序排列,如果姓名相同,按照年龄的降序排列
        //        int rs = o1.getName().compareTo(o2.getName());
        //        rs= rs==0?o2.getAge()-o1.getAge():rs;
        //        return rs;
        //        return o1.getName().compareTo(o2.getName())==0?o2.getAge()-o1.getAge():o1.getName().compareTo(o2.getName());
        //    }
        //};
        //
        //TreeMap<Student, String> tm = new TreeMap<>(c);

        TreeMap<Student, String> tm = new TreeMap<>((o1,o2)-> o1.getName().compareTo(o2.getName())==0?o2.getAge()-o1.getAge():o1.getName().compareTo(o2.getName()));

        tm.put(new Student("zhangsan", 18), "北京");
        tm.put(new Student("lisi", 20), "北京");
        tm.put(new Student("zhangsan", 18), "北京");
        tm.put(new Student("zhangsan", 20), "北京");

        //键找值
        Set<Student> students = tm.keySet();
        for (Student s : students) {
            String value = tm.get(s);
            System.out.println(s + "," + value);
        }
    }
}
