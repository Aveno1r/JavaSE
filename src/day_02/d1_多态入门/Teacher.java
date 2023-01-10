package day_02.d1_多态入门;

public class Teacher extends People {
    String name = "老师";

    @Override
    public void run() {
        System.out.println("老师跑的比较慢...");
    }
}
