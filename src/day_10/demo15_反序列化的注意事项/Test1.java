package day_10.demo15_反序列化的注意事项;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test1 {
    public static void main(String[] args) {
        try (
                // 1.创建序列化流对象,关联目的地文件
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\person2.txt"));
            ){
            // 2.序列化对象
            Person p = new Person("张三",18);
            oos.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
