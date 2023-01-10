package day_03.d6_泛型接口;

public class Test {
    public static void main(String[] args) {
        /*
        修饰符 interface 接口名<类型变量，类型变量，…> {

        }

        接口是用于被类实现的,接口中的泛型,用于给实现类的。

        接口中的泛型,可以在实现类定义的时候,指定泛型的类型。用于约束所有被重写的方法的使用的泛型的类型。
         */

        //需求:定义一个可以处理不同类型(学生,老师)数据的接口

        Teacher t = new Teacher();
        Student s = new Student();

        TeacherDate td = new TeacherDate();
        td.showDate(t);
        //td.showDate(s);//error
        StudentDate sd = new StudentDate();
        //sd.showDate(t);//error
        sd.showDate(s);
    }
}
