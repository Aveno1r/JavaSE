package day_02.d7_抽象类_模板设计模式;

public abstract class Driver {
    //模板方法
    public final void drive() {
        System.out.println("开门");
        System.out.println("点火");
        pos();
        System.out.println("刹车");
        System.out.println("熄火");
    }

    //抽象方法
    public abstract void pos();
}
