package day_14.demo12_解析注解;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        // 需求: 解析类上的注解
        // 获取Demo类的字节码对象
        Class<Demo> c = Demo.class;
        // 通过Demo类的字节码对象获取类上所有的注解
        /*Annotation[] annotations = c.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
             System.out.println("annotation = " + annotation);
        }*/

        // 获取之前,先判断类上是否有MyTest注解
        boolean res = c.isAnnotationPresent(MyTest.class);

        // 如果有再获取该注解的属性值
        if (res){
            // 获取类上的MyTest注解
            MyTest myTest = c.getDeclaredAnnotation(MyTest.class);

            // 获取该注解的属性值
            String value = myTest.value();
            double aaa = myTest.aaa();
            String[] bbb = myTest.bbb();
            System.out.println("value = " + value);
            System.out.println("aaa = " + aaa);
            System.out.println("bbb = " + Arrays.toString(bbb));
        }

        System.out.println("-------------");

        // 需求: 解析test1成员方法的注解
        // 获取test1成员方法对应的Method对象
        Method m = c.getDeclaredMethod("test1");

        // 判断Method对象上是否有MyTest注解
        boolean b = m.isAnnotationPresent(MyTest.class);

        // 如果有MyTest注解,就解析
        if (b){
            // 获取test1成员方法上的MyTest注解
            MyTest myTest = m.getDeclaredAnnotation(MyTest.class);
            // 获取该注解的属性值
            String value = myTest.value();
            double aaa = myTest.aaa();
            String[] bbb = myTest.bbb();
            System.out.println("value = " + value);
            System.out.println("aaa = " + aaa);
            System.out.println("bbb = " + Arrays.toString(bbb));
        }

    }
}
