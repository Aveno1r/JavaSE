package day_10.demo13_序列化和反序列化;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test2 {
    public static void main(String[] args) {
        /*
            ObjectInputStream: 反序列化流,可以用来重构序列化流序列化的对象
                构造方法:
                    public ObjectInputStream(InputStream in
                成员方法:
                    public final Object readObject()
         */
        try (
                // 1.创建反序列化流对象,关联目的地文件
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10\\hhh\\person.txt"));
             ){
            // 2.反序列化---重构对象
            Person p = (Person)ois.readObject();
            System.out.println("p = " + p);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
