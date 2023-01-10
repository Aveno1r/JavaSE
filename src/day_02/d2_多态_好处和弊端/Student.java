package day_02.d2_多态_好处和弊端;

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
