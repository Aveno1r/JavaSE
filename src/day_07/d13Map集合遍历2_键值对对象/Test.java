package day_07.d13Map集合遍历2_键值对对象;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
         //创建集合对象,添加数据
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("小明",99);
        hm.put("小王",100);
        hm.put("小张",66);

        //遍历
        //1.获取所有键值对对象的set集合
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        //2.遍历set集合,获取每一个键值对对象
        for (Map.Entry<String, Integer> entry : entries) {
            //3.通过键值对对象,获取该对象的键和值
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+","+value);
        }

    }
}
