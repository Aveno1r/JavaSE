package day_14self.demo8_反射获取成员方法;



import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestClass {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Cat> c1 = Cat.class;
        Method[] methods = c1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "--->" + method.getParameterCount()
                    + "--->" + method.getReturnType());
        }

        System.out.println("---------------");
        Method run = c1.getDeclaredMethod("run");
        Cat cat = new Cat();
        run.setAccessible(true);
        Object rs1 = run.invoke(cat);
        System.out.println(rs1);

        Method eat = c1.getDeclaredMethod("eat", String.class);
        eat.setAccessible(true);
        Object rs2 = eat.invoke(cat, "<.)#)))≦");
        System.out.println(rs2);
    }
}
