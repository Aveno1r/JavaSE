package day_07self;

import java.util.HashMap;

public class HashMapPra {
    public static void main(String[] args) {
    //    Map和Collection并列存在，用于保存具有映射关系的数据：Key-Value(双列元素）
        HashMap map = new HashMap();
        map.put("no1","sx");
        map.put("no2","sx2");
        map.put("no1","lolll");//key相同的时候，会替换掉旧的内容
        System.out.println("map = " + map);
        //2.Map中的key和value可以是任何类型的数据，会封装到HashMap$Node对象当中。

    }
}
