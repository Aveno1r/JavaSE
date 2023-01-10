package day_01.d3_static_类方法;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.printPass();
        //不推荐
        //s.printHelloWorld();
        Student.printHelloWorld();
    }
}
