package day_01.d7_static应用_单例设计模式;

public class Test {
    public static void main(String[] args) {
        //SingletonDemo1 sd1 = new SingletonDemo1();//error
        SingletonDemo1 sd11 = SingletonDemo1.getInstance();
        SingletonDemo1 sd12 = SingletonDemo1.getInstance();
        //比较地址值
        System.out.println("(sd11==sd12) = " + (sd11 == sd12));

        System.out.println("========");

        SingletonDemo2 sd21 = SingletonDemo2.getInstance();
        SingletonDemo2 sd22 = SingletonDemo2.getInstance();
        System.out.println("(sd21==sd22) = " + (sd21 == sd22));
    }
}
