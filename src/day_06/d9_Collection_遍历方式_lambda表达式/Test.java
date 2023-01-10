package day_06.d9_Collection_遍历方式_lambda表达式;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        //default void forEach(Consumer<? super T> action)
        //public interface Consumer<T> {  void accept(T t); }

        //定义集合,添加数据
        Collection<String> c = new ArrayList<>();
        c.add("德玛西亚");
        c.add("艾希");
        c.add("亚索");

        //匿名内部类
        //Consumer con  = new Consumer<String>() {
        //    @Override
        //    public void accept(String s) {
        //        System.out.println("s:"+s);
        //    }
        //};
        //c.forEach(con);
c.forEach((String s) -> {System.out.println("s:"+s);});
        //Lambda表达式
        //c.forEach((String s)->{System.out.println("s:"+s);});
        //Lambda表达式简化格式
//        c.forEach(s->System.out.println("s:"+s));
    }
}
