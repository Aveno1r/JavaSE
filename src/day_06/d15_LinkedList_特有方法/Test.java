package day_06.d15_LinkedList_特有方法;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("list = " + list);

        //public void addFirst (E e)	在该列表开头插入指定的元素
        list.addFirst("刘备");
        System.out.println("addFirst = " + list);

        //public void addLast (E e)	将指定的元素追加到此列表的末尾
        list.addLast("张飞");
        System.out.println("addLast = " + list);

        //public E getFirst ()	返回此列表中的第一个元素
        System.out.println("list.getFirst() = " + list.getFirst());
        System.out.println("getFirst = " + list);

        //public E getLast ()	返回此列表中的最后一个元素
        System.out.println("list.getLast() = " + list.getLast());
        System.out.println("getLast = " + list);

        //public E removeFirst ()	从此列表中删除并返回第一个元素
        System.out.println("list.removeFirst() = " + list.removeFirst());
        System.out.println("removeFirst = " + list);

        //public E removeLast ()	从此列表中删除并返回最后一个元素
        System.out.println("list.removeLast() = " + list.removeLast());
        System.out.println("removeLast = " + list);

        //pop()   在第1个位置获取元素  相当于removeFrist
        //push()  将元素压入集合中(第1个位置),相当于addFirst
    }
}
