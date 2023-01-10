package day_06self;

import java.util.Vector;

public class VectorPra {
    public static void main(String[] args) {
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);
        System.out.println(vector);
        System.out.println("沈潇"+ "《红楼梦》"  + vector);
        
    }
}
