package day_08.d1_HashMap_特点;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        //特点:(按照键存储)无序,不可重复,无索引    值是可以重复

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("b",2);
        hm.put("c",3);
        hm.put("a",1);
        hm.put("a",2);

        System.out.println("hm = " + hm);
    }
}
