package day_08.d3_LinkedHashMap_键列存储自定义类型;

import java.util.LinkedHashMap;

public class Test {
    public static void main(String[] args) {
        //键:存储学生对象  值:存储籍贯
        //按照键的顺序存储,LinkedHashMap是有序的。


        //认为,姓名,年龄相同的学生,是同一个人,只存一个就可以了。
        LinkedHashMap<Student,String> lhm = new LinkedHashMap<>();
        lhm.put(new Student("李四",20),"上海");
        lhm.put(new Student("张三",18),"北京");
        lhm.put(new Student("张三",18),"深圳");

        //键找值
        //键值对
        //forEach
        lhm.forEach((stu,str)->System.out.println(stu+","+str));
    }
}
