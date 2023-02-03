package day_14self.demo9_反射_框架;

import org.junit.Test;

import java.io.FileNotFoundException;

public class TestFrame {
    @Test
    public void save() throws Exception {
        Student s1 = new Student("sx",45,'男',185.9,"读书,音乐");
        Teacher t1 = new Teacher("波妞", 999.9);
        ObjectFrame.saveObject(s1);
        ObjectFrame.saveObject(t1);
    }
}
