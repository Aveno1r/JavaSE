package day_10self.demo14_序列化注意事项;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        /*
           序列化的注意事项:
                1.对象如果要参与序列化，必须实现序列化接口（java.io.Serializable）
                2.序列化对象的时候,会把对象,以及对象的类型,对象的属性和属性值等等所有信息都序列化
                3.如果某个属性不想被序列化,就使用transient关键字修饰
         */
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\person1.txt"));
        Person person = new Person("sx", 24, new Pet("猫"));
        try {
            oos.writeObject(person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
