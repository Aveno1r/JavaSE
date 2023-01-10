package day_06.d13_List_特有功能;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("a");
        list.add("b");
        System.out.println("list = " + list);

        //void add(int index,E element)	在此集合中的指定位置插入指定的元素
        list.add(1,"张飞");
        System.out.println("add-index = " + list);

        //E remove(int index)	删除指定索引处的元素，返回被删除的元素
        String rs=list.remove(1);
        System.out.println("rs = " + rs);
        System.out.println("remove-index = " + list);

        //E set(int index,E element)	修改指定索引处的元素，返回被修改的旧元素
        String rs2 = list.set(0, "aa");
        System.out.println("rs2 = " + rs2);
        System.out.println("set-index = " + list);

        //E get(int index)	返回指定索引处的元素
        //System.out.println("list.get(0) = " + list.get(0));
        //System.out.println("list.get(1) = " + list.get(1));
        //System.out.println("list.get(1) = " + list.get(2));//java.lang.IndexOutOfBoundsException

        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i) = " + list.get(i));
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println("next = " + next);
        }

    }
}
