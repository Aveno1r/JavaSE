package day_01.d8_继承入门;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("b.i = " + b.i);
        b.print1();

        //System.out.println("b.j = " + b.j);//error
        //b.print2();
    }
}
