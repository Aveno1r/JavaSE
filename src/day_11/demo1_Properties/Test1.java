package day_11.demo1_Properties;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) throws Exception{
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
        Properties pro = new Properties();

        // 2.加载配置文件中的键值对数据
        pro.load(new FileInputStream("day11\\src\\a.properties"));

        //pro.load(new InputStreamReader(new FileInputStream("day11\\src\\a.properties"),"gbk")); // 属性文件中有gbk编码的中文

        // 3.获取属性集对象中的所有键
        Set<String> keys = pro.stringPropertyNames();

        // 4.循环遍历所有的键
        for (String key : keys) {
            // 5.根据键找值
            String value = pro.getProperty(key);
            System.out.println(key + " = " + value);
        }


    }
}
