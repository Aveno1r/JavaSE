package day_14.demo13_模拟Junit框架;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception{
        runClass("com.itheima.demo13_模拟Junit框架.Demo");

    }

    public static void runClass(String className) throws Exception {
        // 获取类的字节码对象
        Class<?> c = Class.forName(className);

        // 通过反射得到传入类的对象
        Constructor<?> con = c.getDeclaredConstructor();// 获取空串构造方法
        // 执行空串构造方法--得到对象
        Object obj = con.newInstance();

        // 通过该类的字节码对象获取所有的成员方法
        Method[] methods = c.getDeclaredMethods();

        // 循环遍历所有的成员方法
        for (Method m : methods) {
            // 在循环中,判断遍历出来的成员方法上是否有MyTest注解
            boolean res = m.isAnnotationPresent(MyTest.class);
            if (res) {
                // 如果有,就执行该方法
                m.invoke(obj);
            }
        }

    }
}
