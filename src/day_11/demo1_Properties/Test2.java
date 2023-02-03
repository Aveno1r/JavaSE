package day_11.demo1_Properties;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class Test2 {
    public static void main(String[] args) throws Exception{
        /*
            Properties类:
                public void store(OutputStream out, String comments);把键值对数据保存到属性文件中
                public void store(Writer out, String comments);把键值对数据保存到属性文件中
                public synchronized Object setProperty(String key, String value);添加键值对数据
         */
        // 需求: 往properties对象中存储一些键值对数据,然后把这些键值对数据保存到属性文件中
        // 1.创建Properties对象
        Properties pro = new Properties();

        // 2.往properties对象中存储一些键值对数据
        pro.setProperty("k1","v1");
        pro.setProperty("k2","v2");
        pro.setProperty("k3","v3");
        pro.setProperty("k4","v4");
        pro.setProperty("k5","v5");

        // 3.把这些键值对数据保存到属性文件中
        pro.store(new FileOutputStream("day11\\src\\b.properties"),"itheima");
        //pro.store(new FileWriter("day11\\src\\b.properties"),"itcast");
    }
}
