package day_04.d9Api_LocalDate_LocalTime_LocalDateTime;

import java.time.LocalDateTime;

//LocalDateTime ==> LocalDate+LocalTime
public class Test {
    public static void main(String[] args) {
        //获取当前(年月日时分秒...)时间对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        //获取指定(年月日时分秒...)时间对象
        LocalDateTime date = LocalDateTime.of(2000, 10, 10, 10, 10, 10);
        System.out.println("date = " + date);

        //getYear、getMonthValue、getDayOfMonth、getDayOfYear、getDayOfWeek、getHour、getMinute、getSecond、getNano	获取年月日、时分秒、纳秒等
        System.out.println("now.getYear() = " + now.getYear());
        System.out.println("now.getHour() = " + now.getHour());
        System.out.println("now.getNano() = " + now.getNano());

        //withYear、withMonth、withDayOfMonth、withDayOfYear,withHour、withMinute、withSecond、withNano	修改某个信息，返回新日期时间对象
        LocalDateTime dateTime1 = now.withYear(2025);
        System.out.println("dateTime1 = " + dateTime1);
        System.out.println("now = " + now);

        //plusYears、plusMonths、plusDays、plusWeeks、plusHours、plusMinutes、plusSeconds、plusNanos	把某个信息加多少，返回新日期时间对象
        LocalDateTime dateTime2 = now.plusYears(3);
        System.out.println("dateTime2 = " + dateTime2);
        System.out.println("now = " + now);

        //minusYears、minusMonths、minusDays、minusWeeks、minusHours、minusMinutes、minusSeconds、minusNanos	把某个信息减多少，返回新日期时间对象
        LocalDateTime dateTime3 = now.minusYears(3);
        System.out.println("dateTime3 = " + dateTime3);
        System.out.println("now = " + now);

        //equals isBefore isAfter	判断2个时间对象，是否相等，在前还是在后
        System.out.println("dateTime1.equals(dateTime2) = " + dateTime1.equals(dateTime2));
        System.out.println("dateTime3.isBefore(dateTime1) = " + dateTime3.isBefore(dateTime1));
        System.out.println("dateTime1.isAfter(dateTime3) = " + dateTime1.isAfter(dateTime3));
    }
}
