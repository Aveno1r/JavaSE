package day_14self.demo6_反射获取类的构造器;

import java.lang.reflect.Constructor;

public class TestClass {
    public static void main(String[] args) {
        //1、反射第一步：必须先得到这个类的Class对象
        Class c1 = Cat.class;
        //2、获取类的全部构造器
        Constructor[] constructors = c1.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "---> 参数个数：" + constructor.getParameterCount());
        }
    }
}
