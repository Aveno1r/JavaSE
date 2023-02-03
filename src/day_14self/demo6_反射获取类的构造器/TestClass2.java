package day_14self.demo6_反射获取类的构造器;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestClass2 {
    @Test
    public void testGetConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Cat> c = Cat.class;

        Constructor<Cat> constructor1 = c.getConstructor();
        System.out.println(constructor1.getName() + "--->参数个数:" + constructor1.getParameterCount());
        constructor1.setAccessible(true);
        Cat cat = (Cat) constructor1.newInstance();
        System.out.println(cat);

        Constructor<Cat> constructor2 = c.getDeclaredConstructor(String.class, int.class);
        System.out.println(constructor2.getName() + "--->参数个数:" + constructor2.getParameterCount());
        constructor2.setAccessible(true);
        Cat cat1 = (Cat) constructor2.newInstance("sx",3);
        System.out.println(cat1);

    }
}
