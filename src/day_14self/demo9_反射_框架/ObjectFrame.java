package day_14self.demo9_反射_框架;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class ObjectFrame {
    public static void saveObject(Object obj) throws Exception{
        PrintStream ps = new PrintStream(new FileOutputStream("src/day_14self/data.txt", true));
        //1)参数obj对象中有哪些属性，属性名是什么实现值是什么，中有对象自己最清楚。
        //2)接着就通过反射获取类的成员变量信息了（变量名、变量值）
        Class c = obj.getClass();
        ps.println("---------"+c.getSimpleName()+"---------");

        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            field.setAccessible(true);
            Object value = field.get(obj) + "";
            ps.print(name + ":");
            ps.println(value);
        }
        ps.close();
    }
}
