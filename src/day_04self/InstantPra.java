package day_04self;

import java.time.Instant;

public class InstantPra {
    public static void main(String[] args) {
    //Instant 表示特定时间瞬间.类似于Date.
    //Date精确到毫秒  Instant精确到纳秒
//        public static Instant now() 	获取当前时间的Instant对象（标准时间）
        //默认获取的格林时区对应的时间。
        Instant now = Instant.now();
        System.out.println(now);
//        public long getEpochSecond()	获取从1970-01-01T00：00：00开始记录的秒数。
        System.out.println("now.getEpochSecond() = " + now.getEpochSecond());
//        public int getNano()	从时间线开始，获取从第二个开始的纳秒数
        System.out.println("now.getNano() = " + now.getNano());
//        plusMillis plusSeconds plusNanos	增加时间系列的方法
        System.out.println("now.plusSeconds(10) = " + now.plusSeconds(10));
//        minusMillis minusSeconds minusNanos	减少时间系列的方法
        System.out.println("now.plusSeconds(9) = " + now.plusSeconds(9));
//        equals、isBefore、isAfter	判断系列的方法

    }
}
