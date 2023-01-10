package day_08self;

import java.util.HashMap;

public class HashMapPra01 {
    public static void main(String[] args) {
        //特点:(按照键存储)无序,不可重复,无索引    值是可以重复
        HashMap map = new HashMap();
        map.put("01","shenxiao");
        map.put("02","shenxiao2");
        map.put("01","shenxiao3");
        map.put("03","shenxiao3");
        System.out.println("map = " + map);
    }
}
