package day_02.d7_抽象类_模板设计模式;

public class Test {
    public static void main(String[] args) {
        NewDriver nd = new NewDriver();
        nd.drive();
        System.out.println("--------");

        OldDriver od = new OldDriver();
        od.drive();
    }
}
