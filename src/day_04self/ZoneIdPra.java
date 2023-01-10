package day_04self;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdPra {
    public static void main(String[] args) {
        //public static Set<String> getAvailableZoneIds()	获取Java中支持的所有时区
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);
        //public static ZoneId systemDefault()	获取系统默认时区
        System.out.println(ZoneId.systemDefault());
        //public static ZoneId of(String zoneId)	获取一个指定时区
        //ZoneId beijing = ZoneId.of("beijing");//java.time.zone.ZoneRulesException: Unknown time-zone ID: beijing
        //System.out.println("beijing = " + beijing);
        //System.out.println("ZoneId.of(\"Shanghai\") = " + ZoneId.of("Shanghai"));//error
        System.out.println(ZoneId.of("Asia/Shanghai"));
    }
}
