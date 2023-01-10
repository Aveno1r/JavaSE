package day_02.d15_静态内部类;

public class Outer {
    static int sNum = 10;
    int num = 999;

    public static class Inner {
        public void show() {
            System.out.println("sNum = " + sNum);
            //System.out.println(num);//error
        }
    }
}
