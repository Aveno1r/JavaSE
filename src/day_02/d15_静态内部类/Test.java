package day_02.d15_静态内部类;

public class Test {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        in.show();
    }
}
