package day_08self;

import java.util.LinkedHashMap;

public class LinkedHashMapPra {
    public static void main(String[] args) {
        //键:存储学生对象  值:存储籍贯
        //按照键的顺序存储,LinkedHashMap是有序的。
        LinkedHashMap<Student, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(new Student("李四",20),"上海");
        linkedHashMap.put(new Student("张三",18),"北京");
        linkedHashMap.put(new Student("张三",18),"深圳");
        linkedHashMap.forEach((student, s) -> System.out.println(student + "" + s));
    }
}
