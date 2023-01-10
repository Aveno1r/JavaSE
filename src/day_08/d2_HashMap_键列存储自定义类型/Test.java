package day_08.d2_HashMap_键列存储自定义类型;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        //键:存储学生对象  值:存储籍贯


        //认为,姓名,年龄相同的学生,是同一个人,只存一个就可以了。
        HashMap<Student,String> hm = new HashMap<>();
        hm.put(new Student("李四",20),"上海");
        hm.put(new Student("张三",18),"北京");
        hm.put(new Student("张三",18),"深圳");

        //键找值
        //键值对
        //forEach
        hm.forEach((stu,str)->System.out.println(stu+","+str));
    }
}
