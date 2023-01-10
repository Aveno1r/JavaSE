package day_08.d4_TreeMap_特点;

import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        //可排序(无序),(键)不可重复,无索引

        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("b",2);
        tm.put("a",1);
        tm.put("c",3);
        tm.put("a",2);

        System.out.println("tm = " + tm);
    }
}
