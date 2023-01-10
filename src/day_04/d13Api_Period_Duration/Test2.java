package day_04.d13Api_Period_Duration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//Duration 描述两个时间(时分秒...)之间的差值
public class Test2 {
    public static void main(String[] args) {
        //public static Duration between(开始时间对象1,截止时间对象2) 	传入2个时间对象，得到Duration对象
        //LocalDate now = LocalDate.now();
        //LocalDate date = LocalDate.of(2000, 10, 10);
        //由于LocalDate只提供年月日，不符合Duration使用场景(计算包含时分秒的时间间隔),所以不能在Duration中使用。
        //Duration duration = Duration.between(date, now);// java.time.temporal.UnsupportedTemporalTypeException
        //LocalTime now = LocalTime.now();
        //LocalTime time = LocalTime.of(10, 10, 10);
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime time = LocalDateTime.of(2000,10,10,10, 10, 10);
        Duration duration = Duration.between(time, now);
        //System.out.println("duration = " + duration);

        //public long toDays()	计算隔多少天，并返回
        System.out.println("duration.toDays() = " + duration.toDays());
        //public long toHours()	计算隔多少小时，并返回
        System.out.println("duration.toHours() = " + duration.toHours());
        //public long toMinutes()	计算隔多少分，并返回
        System.out.println("duration.toMinutes() = " + duration.toMinutes());

        //private long toSeconds()	计算隔多少秒，并返回
        //duration.to
        //public long toMillis()	计算隔多少毫秒，并返回
        System.out.println("duration.toMillis() = " + duration.toMillis());
        //public long toNanos()	计算隔多少纳秒，并返回
        System.out.println("duration.toNanos() = " + duration.toNanos());
    }
}
