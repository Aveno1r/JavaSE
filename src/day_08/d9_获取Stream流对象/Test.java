package day_08.d9_获取Stream流对象;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        //1.集合
        //Collection 拥有的方法  default Stream<E> stream​()
        //List集合
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6);
        Stream<Integer> stream1 = list.stream();

        //Set集合
        Set<Integer> set = new HashSet<>();
        Collections.addAll(set,1,2,3,4,5,6);
        Stream<Integer> stream2 = set.stream();

        //Map集合
        Map<String,Integer> map=new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);

        //获取键的Stream流
        Set<String> keys = map.keySet();
        Stream<String> stream3 = keys.stream();

        //获取值的Stream流
        Collection<Integer> values = map.values();
        Stream<Integer> stream4 = values.stream();

        //2.数组
        int[] arr ={1,2,3,4,5,6};
        //方式1
        IntStream stream5 = Arrays.stream(arr);
        //方式2
        //of(T...t)
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5, 6);//流里面存了6个数据
        //of(T t)
        Stream<int[]> stream7 = Stream.of(arr);//流里面存了1个(数组)数据

    }
}
