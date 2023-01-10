package day_04.d6Api_SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        //格式化 Date->String
        Date d= new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String rs = sdf.format(d);
        System.out.println("rs = " + rs);

        //根据毫秒值进行格式化
        long time = d.getTime();
        //String rs2 = sdf.format(time);
        String rs2 = sdf.format(0L);
        System.out.println("rs2 = " + rs2);

        //解析 String->Date
        String time2 ="2022年12月31日 11:21:18";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d2 = sdf2.parse(time2);//java.text.ParseException
        System.out.println("d2 = " + d2);
    }
}
