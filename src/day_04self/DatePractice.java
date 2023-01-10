package day_04self;

import java.util.Date;

public class DatePractice {
    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();
        System.out.println(date);
//0L对应的1970年1月1日 0时0分0秒是欧洲的时区,二我们在东八区,差了8个小时
        Date date1 = new Date(0L);
        System.out.println(date1);

        Date date2 = new Date();

        System.out.println("date.getTime() = " + date.getTime());

        System.out.println("date2.getTime() = " + date2.getTime());

        date1.setTime(1000L);
        System.out.println(date1);
    }
}
