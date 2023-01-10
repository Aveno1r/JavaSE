package day_08.d10_Stream流对象中间方法;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        //注意:中间(返回值为Stream)方法,具备延迟性,如果没有终结性的方法,延迟性的方法,就不会执行
        //forEach用于遍历数据,该方法没有返回值,是一个终结性方法

        //Stream<T> filter(Predicate<? super T> predicate)	用于对流中的数据进行过滤。
        //public interface Predicate<T> { boolean test(T t);}
        /*
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        Predicate p = new Predicate<Integer>(){

            @Override
            public boolean test(Integer i) {
                //System.out.println("test");
                //过滤所有的偶数
                return i%2==0;
            }
        };
        //filter方法,会将流中每一个数据,传递给test方法的形参,当返回结果为true的时候,将当前参数传入值,放到一个新流里面去
        Stream<Integer> stream1 = stream.filter(p);

        stream1.forEach((Integer i)->{
            System.out.println(i);
        });
        */
        //链式编程
        //Stream.of(1, 2, 3, 4, 5, 6).filter(new Predicate<Integer>(){
        //
        //    @Override
        //    public boolean test(Integer i) {
        //        //过滤所有的偶数
        //        return i%2==0;
        //    }
        //}).forEach((Integer i)->{
        //    System.out.println(i);
        //});
        //Lambda表达式
        //Stream.of(1, 2, 3, 4, 5, 6).filter((Integer i)->{return i%2==0;}).forEach((Integer i)->{
        //    System.out.println(i);
        //});
        Stream.of(1, 2, 3, 4, 5, 6).filter(i -> i % 2 == 0).forEach(i -> System.out.println("filter" + i));

        //Stream<T> sorted()	对元素进行升序排序
        Stream.of(1, 4, 3, 2, 6, 5).sorted().forEach(i -> System.out.println("sorted:" + i));

        //Stream<T> sorted​(Comparator<? super T> comparator)	按照指定规则排序
        Stream.of(1, 4, 3, 2, 6, 5).sorted((i1, i2) -> i2 - i1).forEach(i -> System.out.println("sorted-Comparator:" + i));

        //Stream<T> limit​(long maxSize)	获取前几个元素
        Stream.of(1, 2, 3, 4, 5, 6).limit(3).forEach(i -> System.out.println("limit:" + i));

        //Stream<T> skip​(long n)	跳过前几个元素
        Stream.of(1, 2, 3, 4, 5, 6).skip(3).forEach(i -> System.out.println("skip:" + i));

        //Stream<T> distinct​()	去除流中重复的元素 根据存储类型的hashCode和equals方法去重。
        Stream.of(1, 2, 2, 2, 2, 3).distinct().forEach(i -> System.out.println("distinct:" + i));

        //<R> Stream<R> map​(Function<? super T,​? extends R> mapper)	对元素进行加工，并返回对应的新流
        //public interface Function<T, R> { R apply(T t);}
        /*
        Function fun=  new Function<Integer,Integer>(){

            @Override
            public Integer apply(Integer i) {
                return i*10;
            }
        };
        //将数据,传给apply的形参,将返回的数据,存入一个新的流对象中。根据一个旧数据,按照指定的要求,得到一个新数据。
        Stream.of(1, 2, 3, 4, 5, 6).map(fun).forEach(i -> System.out.println("map:"+i));
        */
        Stream.of(1, 2, 3, 4, 5, 6).map(i -> i * 10).forEach(i -> System.out.println("map:" + i));


        //static <T> Stream<T> concat​(Stream a, Stream b)	合并a和b两个流为一个流
        //Stream<Integer> sa = Stream.of(1, 2, 3);
        //Stream<Integer> sb = Stream.of(4, 5, 6);
        //Stream<Integer> concat = Stream.concat(sa, sb);
        //concat.forEach(i -> System.out.println("concat:" + i));
        Stream.concat(Stream.of(4, 5, 6), Stream.of(1, 2, 3)).forEach(i -> System.out.println("concat:" + i));
    }
}
