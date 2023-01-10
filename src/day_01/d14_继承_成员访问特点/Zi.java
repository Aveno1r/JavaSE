package day_01.d14_继承_成员访问特点;

public class Zi extends Fu {
    String name = "子类";

    @Override
    public void print() {
        System.out.println("Zi print...");
    }

    public void showName() {
        String name = "局部";

        System.out.println("局部的变量:" + name);
        System.out.println("子类成员位置的变量:" + this.name);
        //super 代表父类的
        System.out.println("父类成员位置的变量:" + super.name);

        System.out.println("------------------------");

        //this.print();//this修饰方法加和不加效果完全一样。
        print();

        //访问父类的print方法
        super.print();
    }
}
