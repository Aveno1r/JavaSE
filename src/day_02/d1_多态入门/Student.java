package day_02.d1_多态入门;

public class Student extends People {
    String name = "学生";

    @Override
    public void run() {
        System.out.println("学生跑到飞快...");
    }
}
