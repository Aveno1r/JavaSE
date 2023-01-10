package day_07.d8_TreeSet_比较器排序_Comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        //匿名内部类
        /*Comparator c = new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                //o1表示正在添加的  o2表示已经存在的
                //o1 vs o2 升序
                //需求:优先按照姓名降序排列,按照年龄的升序排列
                int rs = o2.getName().compareTo(o1.getName());
                rs=(rs==0?o1.getAge()-o2.getAge():rs);
                return rs;
            }
        };
        //public TreeSet(Comparator<? super E> comparator)
        TreeSet<Student> ts3 = new TreeSet<>(c);*/
        //匿名内部类直接作为实参
        //TreeSet<Student> ts3 = new TreeSet<>(new Comparator<Student>(){
        //    @Override
        //    public int compare(Student o1, Student o2) {
        //        //o1表示正在添加的  o2表示已经存在的
        //        //o1 vs o2 升序
        //        //需求:优先按照姓名降序排列,按照年龄的升序排列
        //        int rs = o2.getName().compareTo(o1.getName());
        //        rs=(rs==0?o1.getAge()-o2.getAge():rs);
        //        return rs;
        //    }
        //});
        //Lambda表达式
        //TreeSet<Student> ts3 = new TreeSet<>((Student o1, Student o2)->{
        //    int rs = o2.getName().compareTo(o1.getName());
        //    rs=(rs==0?o1.getAge()-o2.getAge():rs);
        //    return rs;
        //});
        //Lambda表达式简化格式
        TreeSet<Student> ts3 = new TreeSet<>((o1, o2)-> (o2.getName().compareTo(o1.getName())==0?o1.getAge()-o2.getAge():o2.getName().compareTo(o1.getName())));


        ts3.add(new Student("zhangsan", 18));
        ts3.add(new Student("lisi", 20));
        ts3.add(new Student("zhangsan", 18));
        ts3.add(new Student("lisi", 18));

        for (Student s : ts3) {
            System.out.println("s = " + s);
        }
    }
}
