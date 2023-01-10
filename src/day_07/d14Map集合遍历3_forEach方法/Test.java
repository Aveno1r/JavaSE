package day_07.d14Map集合遍历3_forEach方法;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class Test {
    public static void main(String[] args) {
        //default void forEach(BiConsumer<? super K, ? super V> action)
        //void accept(T t, U u);

        //创建集合对象,添加数据
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("小明",99);
        hm.put("小王",100);
        hm.put("小张",66);

        //遍历
        //创建BiConsumer实现类对象
        //BiConsumer bc = new BiConsumer<String,Integer>(){
        //
        //    @Override
        //    public void accept(String key, Integer value) {
        //        System.out.println(key+","+value);
        //    }
        //};
        //hm.forEach(bc);
        //hm.forEach((String key, Integer value)->{System.out.println(key+","+value);});
        hm.forEach(( key,  value)->System.out.println(key+","+value));


    }
}
