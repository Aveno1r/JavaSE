package day_02.d16_局部内部类;

public class Test {
    public static void main(String[] args) {
        //只能在局部范围内使用 --鸡肋的语法
        class Inner {
            public void print() {
                System.out.println("Inner print");
            }
        }
        class Inner2 {
            public void print() {
                System.out.println("Inner print");
            }
        }
        Inner in = new Inner();
        in.print();

        System.out.println("Inner print");
    }

    public static void print(){
        class Inner {
            public void print() {
                System.out.println("Inner print");
            }
        }
        class Inner2 {
            public void print() {
                System.out.println("Inner print");
            }
        }
    }

}
