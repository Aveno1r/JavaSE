package day_07.d4_HashSet_存储自定义类型对象;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        //希望内容一样的学生,只存储一个  让该类重写hashCode和equals方法
        HashSet<Student> hs  = new HashSet<>();

        hs.add(new Student("李四",20));
        hs.add(new Student("张三",18));
        hs.add(new Student("张三",18));

        //System.out.println("hs = " + hs);
        for (Student s : hs) {
            System.out.println("s = " + s);
        }
    }
}
