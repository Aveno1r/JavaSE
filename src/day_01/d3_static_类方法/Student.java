package day_01.d3_static_类方法;

public class Student {
    double score;

    //类方法
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    //实例方法
    public void printPass() {
        if (score >= 60) {
            System.out.println("通过考试");
        }else{
            System.out.println("没有通过考试");
        }
    }
}
