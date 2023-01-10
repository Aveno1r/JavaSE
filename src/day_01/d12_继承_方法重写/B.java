package day_01.d12_继承_方法重写;

public class B extends A {

    //子类中出现了与父类一模一样(返回值类型,方法名,形参列表)的方法
    @Override
    public void print() {
        System.out.println("B print...");
    }
}
