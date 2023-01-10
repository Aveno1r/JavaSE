package day_04self;

import java.time.LocalDateTime;

public class LocalDateTimePra {
    public static void main(String[] args) {
        //获取当前(年月日时分秒...)时间对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //获取指定(年月日时分秒...)时间对象
        LocalDateTime date = LocalDateTime.of(2023, 1, 1,19,31,52);
        System.out.println(date);
        //getYear、getMonthValue、getDayOfMonth、getDayOfYear、getDayOfWeek、getHour、getMinute、getSecond、getNano	获取年月日、时分秒、纳秒等
        System.out.println("now.getYear() = " + now.getYear());
        System.out.println("now.getHour() = " + now.getHour());
        System.out.println("now.getNano() = " + now.getNano());
        //withYear、withMonth、withDayOfMonth、withDayOfYear,withHour、withMinute、withSecond、withNano	修改某个信息，返回新日期时间对象
        LocalDateTime localDateTime = now.withYear(2024);
        System.out.println(localDateTime);
        System.out.println(now);
        //plusYears、plusMonths、plusDays、plusWeeks、plusHours、plusMinutes、plusSeconds、plusNanos	把某个信息加多少，返回新日期时间对象
        LocalDateTime localDateTime1 = now.plusYears(2);
        System.out.println(localDateTime1);
        System.out.println(now);
        //minusYears、minusMonths、minusDays、minusWeeks、minusHours、minusMinutes、minusSeconds、minusNanos	把某个信息减多少，返回新日期时间对象
        LocalDateTime localDateTime2 = now.minusYears(5);
        System.out.println(localDateTime2);
        System.out.println(now);
        //equals isBefore isAfter	判断2个时间对象，是否相等，在前还是在后
        boolean equals = localDateTime2.equals(now);
        System.out.println(equals);
        boolean before = localDateTime2.isBefore(now);
        System.out.println(before);
        boolean after = localDateTime2.isAfter(now);
        System.out.println(after);
    }
}
