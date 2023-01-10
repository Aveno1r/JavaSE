package day_01.d6_static应用_代码块;
//静态代码块:加载字节码文件的时候执行1次
//实体代码块:构造方法前执行,每执行1次构造方法,都会执行1次
public class Test {
    public static void main(String[] args) {
        System.out.println("main");
        Student s=new Student();
        Student s2=new Student();
        Student s3 = new Student("张三");
    }
}
