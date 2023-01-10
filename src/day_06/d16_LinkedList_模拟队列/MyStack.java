package day_06.d16_LinkedList_模拟队列;

import java.util.LinkedList;

//模拟队列  先进先出
public class MyStack<E> {
    private LinkedList<E> list = null;

    public MyStack() {
        list = new LinkedList<>();
    }

    //添加
    public void add(E e) {
        //list.addFirst(e);
        list.addLast(e);
    }

    //获取数据
    public E get() {
        //return list.removeLast();
        return list.removeFirst();
    }
}
