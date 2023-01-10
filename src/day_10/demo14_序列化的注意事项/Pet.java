package day_10.demo14_序列化的注意事项;

import java.io.Serializable;

public class Pet implements Serializable {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
