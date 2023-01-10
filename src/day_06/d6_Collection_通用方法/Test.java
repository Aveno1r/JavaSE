package day_06.d6_Collection_通用方法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        Collection<String> c =new ArrayList<>();

        //public boolean add(E e)	把给定的对象添加到当前集合中
        c.add("刘备");
        c.add("关羽");
        c.add("张飞");
        System.out.println("add = " + c);


        //public boolean remove(E e)	把给定的对象在当前集合中删除
        //返回值boolean代表是否删除成功   返回值一般不用  直接调用，
        //System.out.println("c.remove(\"关羽\") = " + c.remove("关羽"));
        //System.out.println("remove = " + c);
        //System.out.println("c.remove(\"关羽\") = " + c.remove("关羽"));
        c.remove("关羽");
        System.out.println("remove = " + c);


        //public boolean contains(Object obj)	判断当前集合中是否包含给定的对象
        System.out.println("c.contains(\"关羽\") = " + c.contains("关羽"));
        System.out.println("c.contains(\"刘备\") = " + c.contains("刘备"));

        //public boolean isEmpty()	判断当前集合是否为空
        System.out.println("c.isEmpty() = " + c.isEmpty());

        //public int size()	返回集合中元素的个数。
        System.out.println("c.size() = " + c.size());

        //public Object[] toArray()	把集合中的元素，存储到数组中
        Object[] arr = c.toArray();
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        //public void clear() 	清空集合中所有的元素
        c.clear();
        System.out.println("clear = " + c);
        System.out.println("c.isEmpty() = " + c.isEmpty());
    }
}
