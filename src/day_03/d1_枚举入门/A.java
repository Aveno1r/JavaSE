package day_03.d1_枚举入门;

public enum A {
    //public static final A X =new A();
    //public static final A Y =new A();
    //public static final A Z =new A();
    //X,Y,Z这样的变量,必须放在枚举的第一行。
    X, Y, Z;

    private String name;

    //public A(){}//error
    private A() {
    }

    private A(String name) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //默认重写了toString,重写后的效果,打印对象名。
}
