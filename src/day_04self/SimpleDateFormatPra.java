package day_04self;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatPra {
    public static void main(String[] args) throws InterruptedException, ParseException {
        //public SimpleDateFormat(String pattern)	创建简单日期格式化对象，并封装时间的格式
        /*
        public final String format(Date date)	将日期格式化成日期/时间字符串
        public final String format(Object time)	将时间毫秒值化成日期/时间字符串
        public Date parse(String source)	把字符串时间解析成日期对象
         */
        SimpleDateFormat formater = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = new Date();
        System.out.println("formater.format(date) = " + formater.format(date));
        Thread.sleep(1000);
        System.out.println("formater.format(System.currentTimeMillis()) = " + formater.format(System.currentTimeMillis()));

        System.out.println(formater.parse("2023年01月01日 15:33:28"));
    }
}
