package day_02.d8接口入门;

public class Test {
    public static void main(String[] args) {
        System.out.println("MyInter.NUM = " + MyInter.NUM);
//        MyInter.NUM=20;//error

        MyInterImpl1 mi = new MyInterImpl1();
        mi.print();

    }
}
