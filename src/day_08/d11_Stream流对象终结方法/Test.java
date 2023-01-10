package day_08.d11_Stream流对象终结方法;

import java.util.Optional;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        //void forEach​(Consumer action)	对此流运算后的元素执行遍历
        Stream.of(1, 2, 3, 4, 5, 6).forEach(i -> System.out.println(i));

        //long count​()	统计此流运算后的元素个数
        long count = Stream.of(1, 2, 3, 4, 5, 6).count();
        System.out.println("count = " + count);

        //Optional<T> max​(Comparator<? super T> comparator)	获取此流运算后的最大值(末位)元素
        Optional<Integer> max = Stream.of(1, 6, 2, 5, 4, 3).max((o1, o2) -> o1 - o2);
        System.out.println("max.get() = " + max.get());

        //Optional<T> min​(Comparator<? super T> comparator)	获取此流运算后的最小值(首位)元素
        Optional<Integer> min​ = Stream.of(1, 6, 2, 5, 4, 3).min((o1, o2) -> o1 - o2);
        System.out.println("max.get() = " + min​.get());
    }
}
