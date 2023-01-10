package day_08self;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class qiantao {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> country = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "南京市","扬州市","苏州市" ,"无锡市","常州市");
        country.put("江苏", list1);
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "武汉市","孝感市","十堰市","宜昌市","鄂州市");
        country.put("湖北", list2);
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "石家庄市","唐山市", "邢台市", "保定市", "张家口市");
        country.put("河北", list3);
        System.out.println(country);

        List<String> cities = country.get("湖北");
        for (String city : cities) {
            System.out.println(city);
        }

        country.forEach((p, c) -> {
            System.out.println(p + "----->" + c);
        });
    }
}
