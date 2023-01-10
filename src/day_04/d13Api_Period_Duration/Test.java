package day_04.d13Api_Period_Duration;

import java.time.LocalDate;
import java.time.Period;

//Period 表示两个时间(年月日)之间的间隔
public class Test {
    public static void main(String[] args) {
        //public static Period between(LocalDate start, LocalDate end)	传入2个日期对象，得到Period对象
        LocalDate now = LocalDate.now();
        LocalDate date = LocalDate.of(2000, 10, 10);
        //Period period = Period.between(now, date);
        Period period = Period.between(date, now);

        //public int getYears()	计算隔几年，并返回
        System.out.println("period.getYears() = " + period.getYears());
        //public int getMonths()	计算隔几个月，年返回
        System.out.println("period.getMonths() = " + period.getMonths());
        //public int getDays()	计算隔多少天，并返回
        System.out.println("period.getDays() = " + period.getDays());
    }
}
