package day_10.demo16_序列化多个对象练习;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {

        try (
                // 1.创建反序列化流对象,关联目的地文件
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10\\hhh\\list.txt"));
             ){
            // 2.反序列化---重构对象
            ArrayList<Person> list = ( ArrayList<Person>)ois.readObject();
            for (Person p : list) {
                System.out.println("p = " + p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
