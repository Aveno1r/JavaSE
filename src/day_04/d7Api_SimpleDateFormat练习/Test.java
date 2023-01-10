package day_04.d7Api_SimpleDateFormat练习;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        //活动开始时间
        String start = "2023年11月11日 0:0:0";
        //活动结束时间
        String end = "2023年11月11日 0:10:0";
        //小贾参加活动时间
        String xj= "2023年11月11日 0:1:18";
        //小皮参加活动时间
        String xp= "2023年11月11日 0:10:51";


        //将String类型的时间,转换成Date对象,获取对应的时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(start);
        Date endDate = sdf.parse(end);
        Date xjDate = sdf.parse(xj);
        Date xpDate = sdf.parse(xp);

        //获取所有时间对应的毫秒值
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long xjTime = xjDate.getTime();
        long xpTime = xpDate.getTime();


        //判断小贾是否成功参与活动
        if (xjTime>=startTime&&xjTime<=endTime){
            System.out.println("小贾成功参与活动...");
        }else{
            System.out.println("小贾参与活动失败...");
        }

        //判断小皮是否成功参与活动
        if (xpTime>=startTime&&xpTime<=endTime){
            System.out.println("小皮成功参与活动...");
        }else{
            System.out.println("小皮参与活动失败...");
        }
    }
}
