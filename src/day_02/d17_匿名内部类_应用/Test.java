package day_02.d17_匿名内部类_应用;

public class Test {
    public static void main(String[] args) {
        //当定义的实现类,只需要使用1次的时候,优先考虑使用匿名内部类。
        Cat c = new Cat();
        go(c);

        //Swiming swim= new Swiming() {
        //    @Override
        //    public void swim() {
        //        System.out.println("狗快乐的游泳");
        //    }
        //};
        //go(swim);

        //作为实参
        go(new Swiming() {
            @Override
            public void swim() {
                System.out.println("猫快乐的游泳");
            }
        });
    }


    public static void go(Swiming swim) {
        swim.swim();
    }

    public static Swiming get() {
        //作为返回值
        return new Swiming() {
            @Override
            public void swim() {
                System.out.println("猫快乐的游泳");
            }
        };
    }
}
