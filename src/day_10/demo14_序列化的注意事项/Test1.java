package day_10.demo14_序列化的注意事项;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test1 {
    public static void main(String[] args) {
        /*
           序列化的注意事项:
                1.对象如果要参与序列化，必须实现序列化接口（java.io.Serializable）
                2.序列化对象的时候,会把对象,以及对象的类型,对象的属性和属性值等等所有信息都序列化
                3.如果某个属性不想被序列化,就使用transient关键字修饰
         */
        try (
                // 1.创建序列化流对象,关联目的地文件
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day10\\hhh\\person1.txt"));
        ) {
            // 2.序列化对象
            Person p = new Person("张三", 18, new Pet("小黑"));
            oos.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
