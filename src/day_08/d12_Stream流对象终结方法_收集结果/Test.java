package day_08.d12_Stream流对象终结方法_收集结果;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        //收集到集合
        //R collect​(Collector collector)	把流处理后的结果收集到一个指定的集合中去
        //这里的R是一个集合,目的为了将来可以收集到不同的集合中去。
        //注意:这里的R的类型,不需要我们自己提供,而是有由Collectors工具类提供
        //public static <T> Collector toList​()	把元素收集到List集合中
        //public static <T> Collector toSet​()	把元素收集到Set集合中
        //public static  Collector toMap​(Function keyMapper , Function valueMapper)	把元素收集到Map集合中


        //收集结果到List集合
        //调用toList方法,返回一个Collector类型对象,并设置R的类型为List类型
        //Collector<? super T, A, R> collector
        Stream<Integer> stream = Stream.of(1, 2, 3);
        Collector<Object, ?, List<Object>> co = Collectors.toList();
        List<Object> list = stream.collect(co);
        System.out.println("list = " + list);

        //收集结果到Set集合
        Stream<Integer> stream2 = Stream.of(1, 2, 3);
        Collector<Object, ?, Set<Object>> co2 = Collectors.toSet();
        Set<Object> set = stream2.collect(co2);
        System.out.println("set = " + set);

        //收集结果到Map集合
        Stream<Integer> stream3 = Stream.of(1, 2, 3);
        //public static  Collector toMap​(Function keyMapper , Function valueMapper)
        //public interface Function<T, R> { R apply(T t);}
        Function fun = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer i) {
                return i * 10;
            }
        };
        Function fun2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer i) {
                return i * 100;
            }
        };
        Collector<Object, ?, Map<Object, Object>> co3 = Collectors.toMap(fun, fun2);
        Map<Object, Object> map = stream3.collect(co3);
        System.out.println("map = " + map);

        //收集到数组
        //Object[] toArray()	把流处理后的结果收集到一个数组中去
        Stream<Integer> stream4 = Stream.of(1, 2, 3);
        Object[] objects = stream4.toArray();
        System.out.println("Arrays.toString(objects) = " + Arrays.toString(objects));
    }
}
