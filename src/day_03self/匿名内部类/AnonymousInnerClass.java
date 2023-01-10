package day_03self.匿名内部类;


public class AnonymousInnerClass {
    //本质是类，内部类，该类没有名字(有名字但是无法直接看到),同时也是一个对象
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();

    }
}

class Outer04{
    private int n1 = 10;

    public void method(){
        A tiger = new A(){
            int n1 = 99;
            @Override
            public void cry() {
                System.out.println("tiger叫");
                System.out.println(Outer04.this.n1);
            }
        };
        tiger.cry();
        System.out.println("tiger.getClass() = " + tiger.getClass());

        Father father = new Father("shenxiao"){
            @Override
            public void test() {
                System.out.println("lol..");
            }
        };
        father.test();
        System.out.println("father.getClass() = " + father.getClass());
    }
}
interface A{
    public void cry();
}

class Father{
    public Father(String name){
        System.out.println("name = " + name);
    }
    public void test(){

    }
}