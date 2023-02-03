package day_14.demo5_获取类的成员方法以及操作成员方法;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception{
        /*
            Class类:
                public Method getDeclaredMethod(String name, Class<?>... parameterTypes);获取某个成员方法(任意权限)
                    参数1: 要获取的方法的方法名
                    参数2: 要获取的方法的形参类型的字节码对象

               public Method[] getDeclaredMethods();获取所有成员方法(任意权限)
         */
        // 获取Student类的字节码对象
        Class<Student> c = Student.class;

        // 需求: 获取第1个成员方法
        Method m1 = c.getDeclaredMethod("show");
        System.out.println("m1 = " + m1);

        // 需求: 获取第2个成员方法
        Method m2 = c.getDeclaredMethod("show", String.class, double.class);
        System.out.println("m2 = " + m2);

        // 需求: 获取第3个成员方法
        Method m3 = c.getDeclaredMethod("show3");
        System.out.println("m3 = " + m3);

        // 需求: 获取第4个成员方法
        Method m4 = c.getDeclaredMethod("show4", double.class, int.class);
        System.out.println("m4 = " + m4);

        // 需求: 获取所有成员方法
        Method[] methods = c.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("m = " + m);
        }

        System.out.println("-------------");
        Student stu1 = new Student();
        Student stu2 = new Student();
        /*
            Method类:
                public Object invoke​(Object obj, Object... args);执行Method对象封装的方法
                    参数1: 执行Method对象封装的方法的对象
                    参数2: 执行Method对象封装的方法需要的实际参数
                    参数3: 执行Method对象封装的方法的返回值
         */
        // 执行m1表示的方法
        //Object res1 = m1.invoke(stu1);
        //System.out.println("res1 = " + res1);// null
        m1.invoke(stu1);

        // 执行m2表示的方法
        Object res2 = m2.invoke(stu1,"黑马程序员",666.6);// 相当于以前的: stu1.show("黑马程序员",666.6);
        System.out.println("res2 = " + res2);// 100

        // 执行m3表示的方法
        m3.setAccessible(true);// 取消权限检查
        m3.invoke(stu1);

        // 执行m4表示的方法
        //Object res4 = m4.invoke(stu1, 3.14, 20);
        Object res4 = m4.invoke(null, 3.14, 20);
        System.out.println("res4 = " + res4);

    }
}
