package day_06self;

import java.util.ArrayList;
import java.util.List;

public class ListTraverse {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");

        //Lambda表达式遍历
        list.forEach((String str) ->{
            System.out.println(str);
        });
    }
}
