package day_01.d1_static_类变量;

//static修饰的成员变量,可以被该类的对象所共享。
//static修饰的成员变量,推荐使用类名调用。
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        Student s2 = new Student();
        System.out.println("s.name = " + s.name+",s.age = " + s.age);
        System.out.println("s2.name = " + s2.name+",s2.age = " + s2.age);

        s.name="张三";
        s.age=18;
        System.out.println("s.name = " + s.name+",s.age = " + s.age);
        System.out.println("s2.name = " + s2.name+",s2.age = " + s2.age);

        Student.name="李四";
        System.out.println("s.name = " + s.name+",s.age = " + s.age);
        System.out.println("s2.name = " + s2.name+",s2.age = " + s2.age);
    }
}
