package day_08.d7_集合嵌套;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //江苏省 = 南京市，扬州市，苏州市，无锡市，常州市
        //湖北省 = 武汉市，孝感市，十堰市，宜昌市，鄂州市
        //河北省 = 石家庄市，唐山市，邢台市，保定市，张家口市

        //创建一个map集合,键(String)表示省,值(ArrayList)表示该省所有的市区
        HashMap<String, ArrayList<String>> country = new HashMap<>();

        //添加每个省,及每个省对应的市区
        //江苏省
        ArrayList<String> cities1 = new ArrayList<>();
        Collections.addAll(cities1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
        country.put("江苏省", cities1);
        //湖北省
        ArrayList<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");
        country.put("湖北省", cities2);
        //河北省
        ArrayList<String> cities3 = new ArrayList<>();
        Collections.addAll(cities3, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");
        country.put("河北省", cities3);

        //遍历-键值对
        Set<Map.Entry<String, ArrayList<String>>> entries = country.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            //获取键值对对象的键
            String province = entry.getKey();
            //System.out.println("province = " + province);
            //获取键值对对象的值
            ArrayList<String> cities = entry.getValue();
            for (String city : cities) {
                //System.out.println("city = " + city);
                System.out.println(province + ":" + city);
            }
        }


    }
}
