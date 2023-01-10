package day_02.d13接口_注意事项;

public class Test {
    public static void main(String[] args) {
        Zi2 zi2 = new Zi2();
        zi2.print();
    }
}

interface MI1 {
    public default void print() {
        System.out.println("Mi1 print");
    }
}

interface MI2 {
    public default void print() {
        System.out.println("MI2 print");
    }
}

class Fu {
    public void print() {
        System.out.println("Fu print");
    }
}

//接口继承多个接口,有同名默认方法，实现类必须重写
interface MI3 extends MI1, MI2 {
    @Override
    public default void print() {
        System.out.println("Mi3 print");
    }
}

//实现类实现的多个接口,有同名默认方法，实现类必须重写
class Zi implements MI1, MI2 {
    @Override
    public void print() {
        System.out.println("Mi1 print");
    }
}

//继承并实现,实例方法与默认方法同名
class Zi2 extends Fu implements MI1{

}