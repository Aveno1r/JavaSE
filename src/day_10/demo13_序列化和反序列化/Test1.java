package day_10.demo13_序列化和反序列化;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test1 {
    public static void main(String[] args) {
        /*
            ObjectOutputStream: 序列化流,可以把java对象写到文件中
                构造方法:
                    public ObjectOutputStream(OutputStream out)
                成员方法:
                    public final void writeObject(Object obj)

                 序列化的注意事项:
                    1.对象如果要参与序列化，必须实现序列化接口（java.io.Serializable）
                    2.序列化对象的时候,会把对象,以及对象的类型,对象的属性和属性值等等所有信息都序列化

         */
        try (
                // 1.创建序列化流对象,关联目的地文件
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day10\\hhh\\person.txt"));
            ){
            // 2.序列化对象
            Person p = new Person("张三",18);
            oos.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
