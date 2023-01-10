package day_02.d11接口_新增三种方法;

public interface MyInter {
    //jdk7以前: 静态常量  抽象方法

    //jdk8:默认方法(有方法体的成员方法)   静态方法
    public default void print(){//public default 不能省略
        System.out.println("MyInter print");
    }
    public static void print2(){

    }

    //jdk9:私有方法
    //private void print3(){}
}
