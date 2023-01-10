package day_06.d8_Collection_遍历方式_增强for;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        //定义集合,添加数据
        Collection<String> c = new ArrayList<>();
        c.add("德玛西亚");
        c.add("艾希");
        c.add("亚索");

        //增强for遍历 只能做获取操作
        for(String s:c){
            System.out.println("s = " + s);
        }

        int[] arr ={1,2,3};
        for(int i:arr){
            System.out.println("i = " + i);
        }
    }
}
