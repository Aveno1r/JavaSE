package day_11self.demo1_Properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws IOException {
         /*
            Properties类:Properties是用来代表属性文件的，通过Properties可以读写属性文件里的内容
                构造方法:
                    public Properties();创建一个空的属性集
               成员方法:
                   public void load(InputStream is); 加载配置文件中的键值对数据
                   public void load(Reader is);加载配置文件中的键值对数据
                   public Set<String> stringPropertyNames();获取所有的键
                   public String getProperty(String key);根据键找值
         */
        // 需求: 读取a.properties属性文件中的所有键值对数据
        // 1.创建Properties属性集对象
        Properties properties = new Properties();
        //2.加载配置文件
       // properties.load(new FileInputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\src\\属性文件.properties"));
        properties.load(new InputStreamReader(new FileInputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\src\\属性文件.properties"),"gbk"));
        //public Set<String> stringPropertyNames();获取所有的键并打印
        Set<String> strings = properties.stringPropertyNames();
        for (String string : strings) {
            String value = properties.getProperty(string);
            System.out.println( string + "->" + value);
        }
        // public String getProperty(String key);根据键找值
        String s = properties.getProperty("liergouzi");
        System.out.println("s = " + s);

    }
}
