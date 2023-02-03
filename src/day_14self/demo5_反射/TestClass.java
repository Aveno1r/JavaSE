package day_14self.demo5_反射;

public class TestClass {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取Student类的字节码代码有三种写法
        //方式1
        Class c1 = Student.class;
        System.out.println(c1.getName());//获取全类名
        System.out.println(c1.getSimpleName());//获取简单类名
        //方式2
        Class c2 = Class.forName("day_14self.demo5_反射.Student");
        System.out.println(c1 == c2);
        //方式3
        Student student = new Student();
        Class c3 = student.getClass();
        System.out.println(c2 == c3);
    }
}
