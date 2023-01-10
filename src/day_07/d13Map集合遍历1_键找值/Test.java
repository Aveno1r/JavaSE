package day_07.d13Map集合遍历1_键找值;

import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        //创建集合对象,添加数据
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("小明",99);
        hm.put("小王",100);
        hm.put("小张",66);

        //遍历
        //1.获取所有的键
        Set<String> keys = hm.keySet();
        //2.遍历所有的键
        for (String key : keys) {
            //3.根据键获取对应的值
            Integer value = hm.get(key);
            System.out.println(key+","+value);
        }

    }
}
