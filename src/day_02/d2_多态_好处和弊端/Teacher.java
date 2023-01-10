package day_02.d2_多态_好处和弊端;

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
