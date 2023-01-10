package day_02.d17_匿名内部类;

public class Test {
    public static void main(String[] args) {
        //1.子类  2.重写方法  3.创建子类对象  4.调用方法
        Cat c = new Cat();
        c.cry();
        //new Cat().cry();

        //匿名内部类 new谁表示创建了谁的子类/实现类对象
        Animal a= new Animal() {
             public void cry() {
                 System.out.println("叫起来...");
             }
         };
       a.cry();
        new Animal() {
            public void cry() {
                System.out.println("叫起来...");
            }
        }.cry();
    }
}
