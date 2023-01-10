package day_06.d11_Collection_遍历_常见问题;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        //1.元素不存在异常
        //2.并发修改异常

        Collection<String> c = new ArrayList<>();
        c.add("张三");
        c.add("李四");
        Iterator<String> it= c.iterator();
        System.out.println("it.next() = " + it.next());
        System.out.println("it.next() = " + it.next());
//        System.out.println("it.next() = " + it.next());//没有数据  -->元素不存在异常
        while (it.hasNext()){
            //迭代器遍历过程中,不能使用集合对象修改元素的个数
            c.add("李四");
            String next = it.next();//java.util.ConcurrentModificationException
            System.out.println("next = " + next);
        }

        //证明:增强for底层使用迭代器
        //for (String s : c) {
        //    c.add("李四");
        //}


        //迭代器遍历的过程中,如果想要修改数据的数据,只能通过迭代器对象增加或删除元素
        //普通的迭代器对象,只支持删除元素
        //想要通过迭代器增加元素,使用特有的迭代器对象listIteratot
        while (it.hasNext()){

            String next = it.next();
            //注意:指针初始值为-1，需要先调用next将指针后移，才能删除对应的位置。
            it.remove();
            //if (next.equals("张三")){
            //    it.remove();
            //}
        }

        System.out.println("c = " + c);
    }
}
