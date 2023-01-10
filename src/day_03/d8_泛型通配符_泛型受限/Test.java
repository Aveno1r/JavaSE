package day_03.d8_泛型通配符_泛型受限;

import java.util.ArrayList;

class Fu{}
class Zi extends Fu{}
class Sun extends Zi{}

public class Test {
    public static void main(String[] args) {
        ArrayList<Fu> listFu = new ArrayList<>();
        ArrayList<Zi> listZi = new ArrayList<>();
        ArrayList<Sun> listSun = new ArrayList<>();


        //泛型,不支持继承关系的。
        ArrayList<Fu> list;
        list=listFu;
        //list=listZi;//error
        //list=listSun;//error

        //当变量的泛型是不确定的,将来需要接收不同泛型类型的对象。可以使用泛型通配符(?)
        ArrayList<?> list2;
        list2=listFu;
        list2=listZi;
        list2=listSun;


        //泛型通配符应用-->在形参中使用
        //由于方法的形参,在调用方法的时候,才知道是什么类型的泛型,所以为了保证形参可以接收任意泛型类型。
        //此时,泛型类型需要使用泛型通配符。

        test1(listFu);
        test1(listZi);
        test1(listSun);


        //泛型下限：  ?  super Car ： ?  能接收的必须是Car或者其父类。
        test2(listFu);
        test2(listZi);
        //test2(listSun);//error

        //泛型上限:   ? extends Car:   ? 能接收的必须是Car或者其子类 。
        //test3(listFu);//error
        test3(listZi);
        test3(listSun);
    }

    //可以接收任意泛型类型的集合
    public static void test1(ArrayList<?> list){

    }

    //可以接收泛型是Zi类或Zi类的父类类型的泛型
    //泛型的最小类型必须是Zi类 : 泛型是Zi类和Zi类的父类
    public static void test2(ArrayList<? super Zi> list){

    }

    //可以接收泛型是Zi类或Zi类的子类类型的泛型
    //泛型的最大类型必须是Zi类 : 泛型是Zi类和Zi的子类
    public static void test3(ArrayList<? extends Zi> list){

    }
}
