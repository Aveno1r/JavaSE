package day_14.demo4_获取类的成员变量以及操作成员变量;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws Exception{
        /*
            Class类:
                public Field getDeclaredField(String name);获取某个成员变量(任意权限)
                    参数: 要获取的成员变量名称

               public Field[] getDeclaredFields();获取所有成员变量(任意权限)
         */
        // 获取Student类的字节码对象
        Class<Student> c = Student.class;

        // 需求: 获取第1个成员变量
        Field f1 = c.getDeclaredField("name");
        System.out.println("f1 = " + f1);

        // 需求: 获取第2个成员变量
        Field f2 = c.getDeclaredField("age");
        System.out.println("f2 = " + f2);

        // 需求: 获取所有成员变量
        Field[] fields = c.getDeclaredFields();
        for (Field f : fields) {
            System.out.println("f = " + f);
        }

        System.out.println("-------------------");
        /*
            Field类:
                public void set(Object obj, Object value);为Field对象表示的成员变量赋值
                    参数1: 成员变量所属的对象
                    参数2: 要赋的值

               public Object get(Object obj); 获取Field对象表示的成员变量的值
                    参数: 成员变量所属的对象
                    返回值: 该成员变量的值
         */
        Student stu1 = new Student();
        Student stu2 = new Student();

        // 为f1封装的成员变量赋值
        f1.set(stu1,"张三");
        System.out.println("stu1 = " + stu1);// Student{name='张三', age=0}
        System.out.println("stu2 = " + stu2);// Student{name='null', age=0}

        // 获取f1封装的成员变量的值
        Object name1 = f1.get(stu1);
        Object name2 = f1.get(stu2);
        System.out.println("name1 = " + name1);// 张三
        System.out.println("name2 = " + name2);// null


        // 为f2封装的成员变量赋值
        f2.setAccessible(true);// 取消权限检查
        f2.set(stu1,18);
        System.out.println("stu1 = " + stu1);// Student{name='张三', age=18}
    }
}
