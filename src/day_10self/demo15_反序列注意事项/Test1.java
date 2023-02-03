package day_10self.demo15_反序列注意事项;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test1 {
    public static void main(String[] args) throws IOException {
         try(
                 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\person2.txt"));
         ) {
            Person p = (Person)ois.readObject();
            System.out.println("p.toString() = " + p.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
