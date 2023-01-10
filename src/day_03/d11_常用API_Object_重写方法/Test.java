package day_03.d11_常用API_Object_重写方法;

public class Test {
    public static void main(String[] args) {

        //实际开发,可以通过  alt+insert快捷键,快速生成重写toString和equals的操作

        Student s = new Student("张三",18);
        System.out.println(s.toString());
        System.out.println(s);

        Student s2 = new Student("张三", 18);
        Student s3 = new Student("李四", 20);


        //默认的equals方法是通过地址值比较
        System.out.println("(s==s2) = " + (s == s2));//false
        //但是在一些场景下,需要通过两个对象的内容,来确定他们是否是同一个事物。
        System.out.println("s.equals(s2) = " + s.equals(s2));
        System.out.println("s.equals(s3) = " + s.equals(s3));

        Student s4 = new Student();//name=null,age=0
        System.out.println("s4.equals(s) = " + s4.equals(s));
    }
}
