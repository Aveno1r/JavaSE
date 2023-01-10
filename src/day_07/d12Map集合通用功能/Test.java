package day_07.d12Map集合通用功能;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        //创建双列集合对象
        Map<String,Integer> map =  new HashMap<>();


        //public V put(K key,V value)	添加元素  返回旧的值 没有旧值,返回null
        //返回值一般不用
        System.out.println("map.put(\"a\",1) = " + map.put("a", 1));
        System.out.println("map.put(\"a\",11) = " + map.put("a", 11));
        map.put("b",2);
        map.put("z",26);
        System.out.println("put = " + map);

        //public int size()	获取集合的大小
        System.out.println("map.size() = " + map.size());

        //public boolean isEmpty()	判断集合是否为空，为空返回true , 反之
        System.out.println("map.isEmpty() = " + map.isEmpty());


        //public V get(Object key)	根据键获取对应值
        System.out.println("map.get(\"a\") = " + map.get("a"));
        System.out.println("map.get(\"b\") = " + map.get("b"));
        System.out.println("map.get(\"c\") = " + map.get("c"));//null

        //public V remove(Object key)	根据键删除整个元素
        //返回值一般不用
        System.out.println("map.remove(\"a\") = " + map.remove("a"));
        System.out.println("map.remove(\"c\") = " + map.remove("c"));
        System.out.println("remove = " + map);

        //public  boolean containsKey(Object key)	判断是否包含某个键
        System.out.println("map.containsKey(\"a\") = " + map.containsKey("a"));
        System.out.println("map.containsKey(\"b\") = " + map.containsKey("b"));

        //public boolean containsValue(Object value)	判断是否包含某个值
        System.out.println("map.containsValue(11) = " + map.containsValue(11));
        System.out.println("map.containsValue(2) = " + map.containsValue(2));

        //public Set<K> keySet()	获取全部键的集合
        Set<String> set = map.keySet();
        System.out.println("set = " + set);

        //public Collection<V> values()	获取Map集合的全部值
        Collection<Integer> c = map.values();
        System.out.println("c = " + c);


        //public void clear()	清空集合
        map.clear();
        System.out.println("clear = " + map);
        System.out.println("map.isEmpty() = " + map.isEmpty());
    }
}
