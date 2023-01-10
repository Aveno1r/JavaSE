package day_03self.局部内部类;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.m1();
    }
}
class Outer2{//外部类
    private int i = 10;
    private void m2(){
        System.out.println("Outer02 m2()");
    }
    public void m1(){
        //局部内部类是定义在外部类的局部位置通常在方法
        //不能添加访问修饰符，但可以使用final修饰
        //作用域：只在定义它的方法或者代码块中有效
        class Inner02{//局部内部类（本质还是一个类）
            //可以访问外部类所有成员，包含私有的
            private int i = 800;//和外部类i重名
            public void f1(){

                //局部内部类可以直接访问外部类的成员例如:m2();
                m2();
                //如果外部类和局部内部类的成员重名，遵守就近原则，
                //如果想访问外部类成员 外部类名.this.成员


                System.out.println("i =" + i);
                System.out.println(Outer2.this.i);
            }
        }
        //外部类在方法中 可以创建Inner02对象，然后调用方法
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}
