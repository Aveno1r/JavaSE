package day_07.d10_Collections工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //list.add("a");
        //list.add("b");
        //list.add("c");
        //public static <T> boolean addAll(Collection<? super T> c, T... elements)	给集合批量添加元素
        Collections.addAll(list,"a","b","c");
        System.out.println("addAll = " + list);

        //public static void shuffle(List<?> list) 	打乱List集合中的元素顺序
        Collections.shuffle(list);
        System.out.println("shuffle = " + list);

        //public static <T> void sort(List<T> list)	对List集合中的元素进行升序排序
        Collections.sort(list);
        System.out.println("sort = " + list);

        //public static <T> void sort(List<T> list，Comparator<? super T> c)	对List集合中元素，按照比较器对象指定的规则进行排序
        //Comparator c = new Comparator<String>(){
        //    @Override
        //    public int compare(String o1, String o2) {
        //        //o1 vs o2 升序
        //        return o2.compareTo(o1);
        //    }
        //};
        //Collections.sort(list,c);
        //Collections.sort(list,(String o1, String o2)->{return o2.compareTo(o1);});
        Collections.sort(list,(o1,  o2)-> o2.compareTo(o1));
        System.out.println("sort-Comparator = " + list);
    }
}
