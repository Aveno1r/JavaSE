package day_07self;

import java.util.HashMap;

public class HashMapPra1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("java",10);
        map.put("php",10);
        map.put("java",20);
        System.out.println("map = " + map);
    }
}
