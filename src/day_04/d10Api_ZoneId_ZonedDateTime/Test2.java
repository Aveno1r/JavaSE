package day_04.d10Api_ZoneId_ZonedDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

//ZonedDateTime 表示含时区的时间信息的类
public class Test2 {
    public static void main(String[] args) {
        //public static ZonedDateTime now() 	获取当前时区的ZonedDateTime对象
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("now = " + now);

        //public static ZonedDateTime now(ZoneId zone) 	获取指定时区的ZonedDateTime对象
        ZoneId shanghai = ZoneId.of("Asia/Shanghai");
        System.out.println("ZonedDateTime.now(shanghai) = " + ZonedDateTime.now(shanghai));
        ZoneId newYork = ZoneId.of("America/New_York");
        System.out.println("ZonedDateTime.now(newYork) = " + ZonedDateTime.now(newYork));


        //getYear、getMonthValue、getDayOfMonth、getDayOfYeargetDayOfWeek、getHour、getMinute、getSecond、getNano	获取年月日、时分秒、纳秒等
        System.out.println("now.getYear() = " + now.getYear());

        //public ZonedDateTime withXxx(时间) 	修改时间系列的方法
        System.out.println("now.withYear(2025) = " + now.withYear(2025));
        //public ZonedDateTime minusXxx(时间) 	减少时间系列的方法
        System.out.println("now.minusYears(3) = " + now.minusYears(3));
        //public ZonedDateTime plusXxx(时间) 	增加时间系列的方法
        System.out.println("now.plusYears(3) = " + now.plusYears(3));

        System.out.println("now = " + now);
    }
}
