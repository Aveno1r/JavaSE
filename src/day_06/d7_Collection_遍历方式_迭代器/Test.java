package day_06.d7_Collection_遍历方式_迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        //定义集合,添加数据
        Collection<String> c = new ArrayList<>();
        c.add("德玛西亚");
        c.add("艾希");
        c.add("亚索");

        //1.获取迭代器对象
        Iterator<String> it = c.iterator();
        //2.通过迭代器，判断是否有数据
        while (it.hasNext()){
            //3.如果有数据,通过迭代器获取数据
            String next = it.next();
            //System.out.println("it.next() = " + it.next());
            //System.out.println("it.next() = " + it.next());//java.util.NoSuchElementException
        }

    }
}
