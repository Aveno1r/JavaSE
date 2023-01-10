package day_01.d11_继承性特点;

public class Test {
    public static void main(String[] args) {
        C c = new C();
        System.out.println("c.i = " + c.i);

        A a = new A();
        System.out.println("a.toString() = " + a.toString());
    }
}

//单继承，不支持多继承 支持多层继承
class A /*extends Object*/ {
    int i = 10;
}

class B {
}

class C extends A {
}
//class C extends A,B{}//error

//一个父类可以有多个子类
class C2 extends A {
}