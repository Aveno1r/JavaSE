package day_04.d12Api_DateTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

//DateTimeFormatter用于让LocalDateTime与String之间进行转换
public class Test {
    public static void main(String[] args) {
        //DateTimeFormatter的方法
        //public static DateTimeFormatter ofPattern(时间格式)
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //public String format(时间对象)
        LocalDateTime now = LocalDateTime.now();
        String rs = dtf.format(now);
        System.out.println("rs = " + rs);
        String time = "2022-12-31.txt 16:43:44";
        //LocalDateTime now2= (LocalDateTime) dtf.parse(time);//返回Parsed类对象  java.lang.ClassCastException: java.time.format.Parsed cannot be cast to java.time.LocalDateTime
        TemporalAccessor parse = dtf.parse(time);
        System.out.println("now2 = " + parse);


        //LocalDateTime的方法
        //public String format(DateTimeFormatter formatter)	格式化时间(反向格式化)
        LocalDateTime now3 = LocalDateTime.now();
        String rs2 = now3.format(dtf);
        System.out.println("rs2 = " + rs2);
        //public static LocalDateTime parse(CharSequence text, DateTimeFormatter formatter) 	解析时间
        String time2 ="2022-12-31.txt 16:51:59";
        LocalDateTime now4 = LocalDateTime.parse(time2, dtf);
        System.out.println("now4 = " + now4);
    }
}
