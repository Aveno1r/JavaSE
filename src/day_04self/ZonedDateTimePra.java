package day_04self;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimePra {
    public static void main(String[] args) {
        /*
        public static ZonedDateTime now() 	获取当前时区的ZonedDateTime对象
        public static ZonedDateTime now(ZoneId zone) 	获取指定时区的ZonedDateTime对象
        getYear、getMonthValue、getDayOfMonth、getDayOfYear、getDayOfWeek、getHour、getMinute、getSecond、getNano	获取年月日、时分秒、纳秒等
        public ZonedDateTime withXxx(时间) 	修改时间系列的方法
        public ZonedDateTime minusXxx(时间) 	减少时间系列的方法
        public ZonedDateTime plusXxx(时间) 	增加时间系列的方法
         */
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        ZoneId zoneId = ZoneId.of("Asia/Chongqing");
        System.out.println(ZonedDateTime.now(zoneId));

    }
}
