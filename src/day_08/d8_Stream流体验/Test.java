package day_08.d8_Stream流体验;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        //method1();
        method2();
    }

    //方式2:Stream流
    public static void method2() {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //流中的数据,过滤
        /*
        Stream<String> stream = list.stream();
        Stream<String> stream2 = stream.filter((String name) -> {
            return name.startsWith("张") && name.length() == 3;
        });
        List<String> list2 = stream2.collect(Collectors.toList());
        System.out.println("list22 = " + list2);
        */

        //链式编程
        List<String> list2 = list.stream().filter((String name) -> {
            return name.startsWith("张") && name.length() == 3;
        }).collect(Collectors.toList());
        System.out.println("list22 = " + list2);
        //使用过的流对象,不能2次使用
        //Stream<String> stream3 = stream.filter((String name) -> {
        //    return name.startsWith("张") && name.length() == 3;
        //});

    }

    //方式1:普通方式
    public static void method1() {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //把集合中所有以“张”开头，且是3个字的元素存储到一个新的集合。

        List<String> list2 = new ArrayList<>();
        //遍历
        for (String name : list) {
            if (name.startsWith("张") && name.length() == 3) {
                list2.add(name);
            }
        }
        //打印结果
        System.out.println("list2 = " + list2);
    }
}
