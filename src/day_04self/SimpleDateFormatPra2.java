package day_04self;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatPra2 {
    public static void main(String[] args) throws ParseException {
//        Date start = new Date(2023,11,11,0,0,0);
//        Date end = new Date(2023,11,11,0,10,0);
//        Date jia = new Date(2023, 11, 11, 0, 01, 18);
//        Date pi = new Date(2023, 11, 11, 0, 10, 51);
//
//        long startTime = start.getTime();
//        long endTime = end.getTime();
//        long jiaTime = jia.getTime();
//        long piTime = pi.getTime();
//
//        if (jiaTime >= startTime && jiaTime <= endTime){
//            System.out.println("小甲参加了");
//        }else {
//            System.out.println("没参加");
//        }
//        if (piTime >= startTime && piTime <= endTime){
//            System.out.println("小皮参加了");
//        }else {
//            System.out.println("没参加");
//        }

        //活动开始时间
        String start = "2023年11月11日 0:0:0";
        //活动结束时间
        String end = "2023年11月11日 0:10:0";
        //小贾参加活动时间
        String xj= "2023年11月11日 0:1:18";
        //小皮参加活动时间
        String xp= "2023年11月11日 0:10:51";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(start);
        Date endDate = sdf.parse(end);
        Date xjDate = sdf.parse(xj);
        Date xpDate = sdf.parse(xp);

        if(xjDate.before(endDate)&&xjDate.after(startDate)){
            System.out.println("xj参加了");
        }else {
            System.out.println("xj没参加");
        }
        if(xpDate.before(endDate)&&xpDate.after(startDate)){
            System.out.println("xp参加了");
        }else {
            System.out.println("xp没参加");
        }
    }
}
