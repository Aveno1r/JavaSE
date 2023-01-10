package day_10.demo16_序列化多个对象练习;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {

        try (
                // 1.创建序列化流对象,关联目的地文件
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day10\\hhh\\list.txt"));
            ){
            // 2.序列化对象
            Person p1 = new Person("张三1",18);
            Person p2 = new Person("张三2",28);
            Person p3 = new Person("张三3",38);
            Person p4 = new Person("张三4",48);

            // 3.创建ArrayList集合,指定集合元素类型为Person
            ArrayList<Person> list = new ArrayList<>();

            // 4.把对象添加到集合中
            list.add(p1);
            list.add(p2);
            list.add(p3);
            list.add(p4);

            // 5.序列化集合
            oos.writeObject(list);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
