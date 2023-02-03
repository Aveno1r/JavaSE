package day_14.demo6_utils;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.nio.channels.AsynchronousServerSocketChannel;

public class Utils {
    //需求: 对于任意一个对象，该框架都可以把对象的字段名和对应的值，保存到文件中去
    public static void writeObjectAttributeAndValueToTxt(Object obj) throws Exception {
        // 获取该对象的字节码对象
        Class<?> c = obj.getClass();
        // 通过字节码对象获取所有的成员变量
        Field[] fields = c.getDeclaredFields();

        // 创建打印流对象,关联目的地文件,并可以追加续写
        PrintStream ps = new PrintStream(new FileOutputStream("src/day_14/object.txt",true));
        ps.println("===================="+c.getSimpleName()+"====================");

        // 循环遍历所有的成员变量
        for (Field f : fields) {
            // 获取成员变量的名称
            String name = f.getName();
            // 获取成员变量的值
            f.setAccessible(true);
            Object value = f.get(obj);
            // 把成员变量和成员变量的值写到文件中
            ps.println(name+"="+value);
            ps.flush();
        }

        // 释放资源
        ps.close();

    }
}
