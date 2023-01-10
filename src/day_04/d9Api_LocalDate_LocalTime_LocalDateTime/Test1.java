package day_04.d9Api_LocalDate_LocalTime_LocalDateTime;

import java.time.LocalDate;

//LocalDate 表示"年月日"的时间的类
public class Test1 {
    public static void main(String[] args) {
        //获取当前(年月日)时间对象
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);
        
        //获取指定(年月日)时间对象
        LocalDate date = LocalDate.of(2000, 10, 10);
        System.out.println("date = " + date);


        //处理年月日相关的方法
        //public int geYear()	获取年
        System.out.println("now.getYear() = " + now.getYear());
        //public int getMonthValue()	获取月份（1-12）
        System.out.println("now.getMonthValue() = " + now.getMonthValue());
        //public int getDayOfMonth()	获取日
        System.out.println("now.getDayOfMonth() = " + now.getDayOfMonth());
        //public int getDayOfYear()	获取当前是一年中的第几天
        System.out.println("now.getDayOfYear() = " + now.getDayOfYear());
        //Public DayOfWeek getDayOfWeek()	获取星期几：ld.getDayOfWeek().getValue()
        System.out.println("now.getDayOfWeek() = " + now.getDayOfWeek());


        //withYear、withMonth、withDayOfMonth、withDayOfYear	直接修改某个信息，返回新日期对象
        LocalDate date1 = now.withYear(2025);
        System.out.println("date1 = " + date1);
        System.out.println("now = " + now);//保留原有数据

        //plusYears、plusMonths、plusDays、plusWeeks	把某个信息加多少，返回新日期对象
        LocalDate date2 = now.plusYears(3);
        System.out.println("date2 = " + date2);
        System.out.println("now = " + now);

        //minusYears、minusMonths、minusDays，minusWeeks	把某个信息减多少，返回新日期对象
        LocalDate date3 = now.minusYears(3);
        System.out.println("date3 = " + date3);
        System.out.println("now = " + now);


        //equals isBefore isAfter	判断两个日期对象，是否相等，在前还是在后
        System.out.println("date1.equals(date2) = " + date1.equals(date2));
        System.out.println("date3.isBefore(date1) = " + date3.isBefore(date1));
        System.out.println("date1.isAfter(date3) = " + date1.isAfter(date3));
    }
}
