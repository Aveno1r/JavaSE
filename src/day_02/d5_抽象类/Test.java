package day_02.d5_抽象类;

public class Test {
    public static void main(String[] args) {
        //A a = new A();//error
        //抽象类的功能是通过其子类使用
        B b = new B();
        b.print();
        b.print2();
    }
}
