package day_10self.demo15_反序列注意事项;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) throws IOException {
           try ( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\person2.txt"));
        ){
               Person sx = new Person("sx", 24);
               oos.writeObject(sx);
        } catch (IOException e) {
          e.printStackTrace();
        }
    }
}
