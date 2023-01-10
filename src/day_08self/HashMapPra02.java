package day_08self;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPra02 {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        map.put(new Student("sx",12),"湖北");
        map.put(new Student("ds",18),"湖南");
        map.put(new Student("sx",12),"北京");
        //认为,姓名,年龄相同的学生,是同一个人,只存一个就可以了。
        map.forEach(((student, s) -> System.out.println(student + "" + s)));
        //Student{name='ds', age=18}湖南
        //Student{name='sx', age=12}北京

        //HashMap遍历方法 键找值
        Set<Student> keys = map.keySet();
        for (Student student : keys) {
            String value = map.get(student);
            System.out.println(keys + " " + value);
        }

        //HashMap遍历 键值对对象
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "" + value);
        }
    }
}
