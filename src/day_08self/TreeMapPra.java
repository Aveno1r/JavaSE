package day_08self;

import java.util.TreeMap;

public class TreeMapPra {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        //可排序(无序),(键)不可重复,无索引
        tm.put("b",2);
        tm.put("a",1);
        tm.put("c",3);
        tm.put("a",2);
        System.out.println(tm);
    }
}
