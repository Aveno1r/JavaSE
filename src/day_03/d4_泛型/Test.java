package day_03.d4_泛型;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //没有泛型
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(true);
        list.add(100);
        for (int i = 0; i < list.size(); i++) {
            //1.接收数据,需要做强制类型转换
            //2.有可能出现类型转换异常
            String s = (String)list.get(i);//java.lang.Boolean cannot be cast to java.lang.String
        }

        //使用泛型
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("abc");
        //list2.add(true);//error
        //list2.add(100);//error
        for (int i = 0; i < list2.size(); i++) {
            String s = list2.get(i);
        }
    }
}
