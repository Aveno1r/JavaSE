package day_03.d9_泛型擦除;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //java编译成class : 编译期间:1.先通过泛型,检查数据类型上的错误  2.去除(擦除)泛型  3.编译
        ArrayList<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        //list.add(true);//error

        String s = list.get(1);
        System.out.println("s = " + s);


        //泛型不支持基本数据类型
        //在java中,为每种基本数据类型提供了对应的引用数据类型。 比如int-->Integer  后面会学包装类。
        //ArrayList<int> list2;//error
        ArrayList<Integer> list2;
    }
}
