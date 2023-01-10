package day_04.d9Api_LocalDate_LocalTime_LocalDateTime;

import java.time.LocalTime;

//LocalTime 表示时分秒纳米的类
public class Test2 {
    public static void main(String[] args) {
        //获取当前(时分秒)时间对象
        LocalTime now = LocalTime.now();
        System.out.println("now = " + now);

        //获取指定(时分秒)时间对象
        LocalTime time = LocalTime.of(15, 0, 0);
        System.out.println("date = " + time);
        //LocalTime.of(15,0,0,0)//纳秒级别

        //public int getHour()	获取小时
        System.out.println("now.getHour() = " + now.getHour());
        //public int getMinute()	获取分
        System.out.println("now.getMinute() = " + now.getMinute());
        //public int getSecond()	获取秒
        System.out.println("now.getSecond() = " + now.getSecond());
        //public int getNano()	获取纳秒
        System.out.println("now.getNano() = " + now.getNano());

        //withHour、withMinute、withSecond、withNano	修改时间，返回新时间对象
        LocalTime time1 = now.withHour(16);
        System.out.println("time1 = " + time1);
        System.out.println("now = " + now);

        //plusHours、plusMinutes、plusSeconds、plusNanos	把某个信息加多少，返回新时间对象
        LocalTime time2 = now.plusHours(1);
        System.out.println("time2 = " + time2);
        System.out.println("now = " + now);

        //minusHours、minusMinutes、minusSeconds、minusNanos	把某个信息减多少，返回新时间对象
        LocalTime time3 = now.minusHours(1);
        System.out.println("time3 = " + time3);
        System.out.println("now = " + now);

        //equals isBefore isAfter	判断2个时间对象，是否相等，在前还是在后
        System.out.println("time1.equals(time2) = " + time1.equals(time2));
        System.out.println("time3.isBefore(time1) = " + time3.isBefore(time1));
        System.out.println("time1.isAfter(time3) = " + time1.isAfter(time3));
    }
}
