package day_06.d17_LinkedList_模拟堆栈;

import java.util.LinkedList;

//堆栈接口   先进后出
public class MyStack<E> {
    private LinkedList<E> list;

    public MyStack() {
        list = new LinkedList<>();
    }

    //添加
    public void add(E e) {
        //list.addFirst(e);
        list.push(e);//推荐
        //list.addLast(e);
    }

    //获取
    public E get() {
        //return list.removeFirst();
        return list.pop();//推荐
        //return list.removeLast();
    }
}
