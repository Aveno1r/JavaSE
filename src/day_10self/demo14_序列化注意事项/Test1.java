package day_10self.demo14_序列化注意事项;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test1 {
    public static void main(String[] args) throws IOException {
         /*
            ObjectInputStream: 反序列化流,可以用来重构序列化流序列化的对象
                构造方法:
                    public ObjectInputStream(InputStream in
                成员方法:
                    public final Object readObject()
         */
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\person1.txt"));

        try {
            Object o = ois.readObject();
            System.out.println("o.toString() = " + o.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
