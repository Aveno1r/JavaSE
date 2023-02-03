package day_10self.demo16_序列化多个对象练习;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\person3.txt"));
        Person sx1 = new Person("sx1", 21);
        Person sx2 = new Person("sx2", 22);
        Person sx3 = new Person("sx3", 23);
        Person sx4 = new Person("sx4", 24);

        ArrayList<Person> people = new ArrayList<>();
        people.add(sx1);
        people.add(sx2);
        people.add(sx3);
        people.add(sx4);

        try {
            oos.writeObject(people);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
