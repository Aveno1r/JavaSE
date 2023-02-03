package day_14self.demo10_注解;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationTest {
    public static void main(String[] args) {
        Class<Demo> aClass = Demo.class;
//        Annotation[] annotations = aClass.getDeclaredAnnotations();
//        for (Annotation annotation : annotations) {
//            System.out.println("annotation = " + annotation);
//        }
//
        if (aClass.isAnnotationPresent(MyTest.class)){
            MyTest myTest = aClass.getDeclaredAnnotation(MyTest.class);
            System.out.println("myTest.value() = " + myTest.value());
            System.out.println("myTest.aaa() = " + myTest.aaa());
            System.out.println("myTest.bbb() = " + myTest.bbb());
        }
    }

    @Test
    public void parseMethods() throws NoSuchMethodException {
        Class<Demo> c = Demo.class;
        Method m = c.getDeclaredMethod("test");
        if (m.isAnnotationPresent(MyTest.class)){
            MyTest test = m.getDeclaredAnnotation(MyTest.class);
            System.out.println("test.value() = " + test.value());
            System.out.println("test.aaa() = " + test.aaa());
            System.out.println("test.bbb() = " + test.bbb());
        }
    }
}
