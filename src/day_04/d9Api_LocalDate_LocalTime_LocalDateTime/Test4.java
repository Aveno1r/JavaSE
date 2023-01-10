package day_04.d9Api_LocalDate_LocalTime_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//LocalDateTime 转化 LocalDate和LocalTime
public class Test4 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);


        //public LocalDate toLocalDate()	转换成一个LocalDate对象
        //public LocalTime toLocalTime()	转换成一个LocalTime对象
        LocalDate date = now.toLocalDate();
        System.out.println("date = " + date);

        LocalTime time = now.toLocalTime();
        System.out.println("time = " + time);
    }
}
