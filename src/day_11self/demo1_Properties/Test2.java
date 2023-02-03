package day_11self.demo1_Properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) throws IOException {
          /*
            Properties类:
                public void store(OutputStream out, String comments);把键值对数据保存到属性文件中
                public void store(Writer out, String comments);把键值对数据保存到属性文件中
                public synchronized Object setProperty(String key, String value);添加键值对数据
         */
        // 需求: 往properties对象中存储一些键值对数据,然后把这些键值对数据保存到属性文件中
        // 1.创建Properties对象
        Properties properties = new Properties();
        //   public synchronized Object setProperty(String key, String value);添加键值对数据
        properties.setProperty("sx","no1");
        properties.setProperty("sx2","no2");
        properties.setProperty("sx3","no3");
        //public void store(OutputStream out, String comments);把键值对数据保存到属性文件中
         properties.store(new FileOutputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\src\\属性文件2.properties"),"你爹写的");

        // public void store(Writer out, String comments);把键值对数据保存到属性文件中
        //properties.store(new FileWriter("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\src\\属性文件2.properties"),"你爸爸写的");

        Set<String> keys= properties.stringPropertyNames();
        for (String key : keys) {
            String value = properties.getProperty(key);
            System.out.println(key + "->" + value);
        }
    }
}
