package day_04.d11Api_Instant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//Zero  0

//Instant 表示特定时间瞬间.类似于Date.
//Date精确到毫秒  Instant精确到纳秒
public class Test {
    public static void main(String[] args) {
        //public static Instant now() 	获取当前时间的Instant对象（标准时间）
        //默认获取的格林时区对应的时间。
        Instant now = Instant.now();
        System.out.println("now = " + now);
        //public long getEpochSecond()	获取从1970-01-01T00：00：00开始记录的秒数。
        System.out.println("now.getEpochSecond() = " + now.getEpochSecond());
        //public int getNano()	从时间线开始，获取从第二个开始的纳秒数
        System.out.println("now.getNano() = " + now.getNano());
        //plusMillis plusSeconds plusNanos	增加时间系列的方法
        System.out.println("now.plusSeconds(1) = " + now.plusSeconds(1));
        //minusMillis minusSeconds minusNanos	减少时间系列的方法
        System.out.println("now.minusSeconds(1) = " + now.minusSeconds(1));
        //equals、isBefore、isAfter	判断系列的方法
        Instant instant = now.plusSeconds(1);
        Instant instant2 = now.plusSeconds(1);
        System.out.println("instant.equals(instant2) = " + instant.equals(instant2));//true
        System.out.println("now.isBefore(instant) = " + now.isBefore(instant));
        System.out.println("instant.isAfter(now) = " + instant.isAfter(now));

        System.out.println("now = " + now);


        //可以根据指定的时区,获取对应的时间
        //ZonedDateTime atZone(ZoneId zone)  将此瞬间与时区相结合，创建一个 ZonedDateTime
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);
    }
}
