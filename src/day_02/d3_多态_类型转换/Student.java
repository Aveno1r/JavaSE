package day_02.d3_多态_类型转换;

public class Student extends People {

    @Override
    public void run() {
        System.out.println("学生跑到飞快...");
    }

    //学生类特有的功能
    public void study(){
        System.out.println("学java");
    }
}
