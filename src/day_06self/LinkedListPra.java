package day_06self;

import java.util.LinkedList;

public class LinkedListPra {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = 0; i < 6; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
