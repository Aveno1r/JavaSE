package day_01.d5_static_类方法_注意事项;

public class Test {
    //静态内容
    static int sNum = 10;

    public static void sPrint() {

    }

    //非静态内容
    int num = 10;

    public void print() {

    }


    //静态方法
    public static void staticShow() {
        //在静态方法中,可以直接访问静态的成员,不能直接访问非静态的成员。
        System.out.println("sNum = " + sNum);
        sPrint();
        //System.out.println("num = " + num);//error
        //print();//error

        //静态方法中,没有this(this代表调用当前方法的对象)
        //System.out.println("sNum = " + this.sNum);//error
    }


    //非静态方法
    public void show() {
        //在非静态方法中,可以直接访问静态的成员 和 非静态的成员。
        System.out.println("sNum = " + sNum);
        sPrint();
        System.out.println("num = " + num);
        print();
    }
}
