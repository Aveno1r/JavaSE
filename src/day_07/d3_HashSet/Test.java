package day_07.d3_HashSet;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("刘备");
        hs.add("关羽");
        hs.add("张飞");
        hs.add("刘备1");
        hs.add("关羽1");
        hs.add("张飞1");
        hs.add("刘备2");
        hs.add("关羽2");
        hs.add("张飞2");
        hs.add("刘备3");
        hs.add("关羽3");
        hs.add("张飞3");
        System.out.println("hs = " + hs);
        System.out.println("---------");

        HashSet<Student> hs2 = new HashSet<>();
        //hashCode方法,默认是根据地址值得到的,如果没有重写hashCode方法,不同对象哈希值可能不一样。
        //不符合开发需求,一般认为对象的内容如果相同,代表同一个对象。
        //思考如何解决:hashCode和equasl方法
        hs2.add(new Student("张三",18));
        hs2.add(new Student("张三",18));

        System.out.println("hs2 = " + hs2);
    }
}
