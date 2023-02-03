package day_14.demo2_获取类的字节码对象;

import java.lang.reflect.Type;
import java.util.Calendar;

public class Test1 {
    public static void main(String[] args) throws Exception{
        //获取Class对象的三种方式
        //Class c1 = 类名.class
        Class<Student> c1 = Student.class;

        //调用Class提供方法：public static Class forName(String className)；
        Class<?> c2 = Class.forName("com.itheima.demo2_获取类的字节码对象.Student");

        //Object提供的方法： public Class getClass()；  Class c3 = 对象.getClass();
        Student stu = new Student();
        Class<? extends Student> c3 = stu.getClass();

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println(c1 == c2);// true
        System.out.println(c2 == c3);// true

        // 扩展获取类的类加载器: ClassLoader getClassLoader() 回该类的类加载器。
        ClassLoader classLoader = c1.getClassLoader();
        System.out.println("classLoader = " + classLoader);

        //  扩展: Class<?>[] getInterfaces() 获取当前类实现的所有接口的字节码对象
        // 需求: 获取Student类实现的所有接口的字节码对象
        Class<?>[] interfaces = c1.getInterfaces();
        for (Class<?> c : interfaces) {
            System.out.println("c = " + c);
        }



    }
}
