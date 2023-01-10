package day_01.d6_static应用_代码块;

public class Student {
    String name;

    static {
        System.out.println("student 静态代码块");
        //作用:在加载程序的时候,加载相关资源
    }

    {
        System.out.println("student 实例/构造代码块");
        //作用:执行所有的构造方法统一要做的事情
        name="";
    }

    public Student() {
        System.out.println("student 无参构造方法");
        //name="";
    }

    public Student(String name) {
        System.out.println("student 有参构造方法");
        //name="";
        //this.name = name;
    }
}
