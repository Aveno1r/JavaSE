package day_06.d12_List_特点;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //特点:1.有序(存的内容的顺序和添加元素的顺序一致)  2.元素可以重复  3.有索引(含有与索引相关的方法)

        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("a");

        System.out.println("list = " + list);
    }
}
