package day_14.demo3_获取类的构造方法以及操作构造方法;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception {
        /*
            Class类:
                public Constructor<?>[] getDeclaredConstructors();获取所有的构造方法(任意权限)
                public Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes);获取某个构造方法(任意权限
         */
        // 获取Student类的字节码对象
        Class<Student> c = Student.class;

        // 需求:获取第1个构造方法
        Constructor<Student> con1 = c.getDeclaredConstructor();
        System.out.println("con1 = " + con1);

        // 需求:获取第2个构造方法
        Constructor<Student> con2 = c.getDeclaredConstructor(String.class, int.class);
        System.out.println("con2 = " + con2);

        // 需求:获取第3个构造方法
        Constructor<Student> con3 = c.getDeclaredConstructor(String.class);
        System.out.println("con3 = " + con3);

        // 需求:获取第4个构造方法
        Constructor<Student> con4 = c.getDeclaredConstructor(int.class);
        System.out.println("con4 = " + con4);

        // 需求:获取所有构造方法
        Constructor<?>[] constructors = c.getDeclaredConstructors();
        for (Constructor<?> con : constructors) {
            System.out.println("con = " + con);
        }

        System.out.println("------------");
        /*
            Constructor类:
                public T newInstance(Object... initargs); 调用Constructor对象封装的构造方法,创建对象
                    参数: 执行Constructor对象封装的构造方法需要的实际参数
                    返回值: 构造方法创建出来的对象
               public void setAccessible(boolean flag) ;是否取消权限检查
                    参数: true表示取消权限检查,  false表示不取消权限检查
         */

        // 通过con1对象创建Student对象
        Student stu1 = con1.newInstance();// 相当于以前的: new Student()
        System.out.println("stu1 = " + stu1);

        // 通过con2对象创建Student对象
        Student stu2 = con2.newInstance("张三", 18);// 相当于以前的: new Student("张三",18)
        System.out.println("stu2 = " + stu2);

        // 通过con3对象创建Student对象
        Student stu3 = con3.newInstance("李四");
        System.out.println("stu3 = " + stu3);

        // 通过con4对象创建Student对象
        // 由于con4封装的构造方法是private修饰,所以需要取消权限检查
        con4.setAccessible(true);
        Student stu4 = con4.newInstance(20);
        System.out.println("stu4 = " + stu4);
    }
}
