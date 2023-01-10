package day_07.d1_set_特点;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        //1.无序  2.不重复  3.无索引
        Set<String> set = new HashSet<>();
        set.add("b");
        set.add("a");
        set.add("c");
        set.add("a");
//        Object[] array = set.toArray();
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        System.out.println("set = " + set);
        System.out.println("set.size() = " + set.size());

    }
}
