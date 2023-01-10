package day_05.d1_lambda入门;

public class Test {
    public static void main(String[] args) {

        //使用go方法,需要传入Swiming接口的实现类对象,假设该实现类的对象只需要在这里用1次。优先考虑使用匿名内部类。
        //匿名内部类,本质是一个对象,是一种面向对象的编程。
        Swiming swim = new Swiming() {
            @Override
            public void swim() {
                System.out.println("gogogo...");
            }
        };
        go(swim);

        //lambda表达式  是一种面向过程的编程思想,只关注要做什么  只能针对“函数式接口”的匿名内部类进行简化
        //Swiming swim2 = ()->{ System.out.println("gogogo2..."); };
        //go(swim2);
        go(()->{ System.out.println("gogogo2..."); });
    }

    public static void go(Swiming swim) {
        swim.swim();
    }
}
