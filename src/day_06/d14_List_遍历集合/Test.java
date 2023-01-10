package day_06.d14_List_遍历集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");

        //for循环（因为List集合有索引）
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i) = " + list.get(i));
        }
        System.out.println("----------------");

        //迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String rs = it.next();
            System.out.println("rs = " + rs);
        }
        System.out.println("----------------");

        //增强for循环
        for(String s:list){
            System.out.println("s = " + s);
        }
        System.out.println("----------------");

        //Lambda表达式
        //list.forEach((String s)->{
        //    System.out.println("forEach = "+s);
        //});
        list.forEach(s->
            System.out.println("forEach = "+s)
        );
    }
}
