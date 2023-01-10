package day_02.d3_多态_类型转换;

public class Teacher extends People {

    @Override
    public void run() {
        System.out.println("老师跑的比较慢...");
    }

    //老师类特有的功能
    public void teach(){
        System.out.println("讲java");
    }
}
