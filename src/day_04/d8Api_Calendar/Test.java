package day_04.d8Api_Calendar;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //月:从数字0开始表示,0月表示1月,依次类推
        //周:从数字1开始表示,1表示星期天。 2表示星期一,依次类推...


        //public static Calendar getInstance()	获取当前日历对象
        Calendar cal = Calendar.getInstance();
        System.out.println("cal = " + cal);

        //public int get(int field)	获取日历中的某个信息。
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        month++;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);//Calendar.HOUR 12小时制   Calendar.HOUR_OF_DAY 24小时制
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        System.out.println(year + "年" + month + "月" + day + "日 " + hour + ":" + minute + ":" + second);

        String[] weeks = {"星期天","星期一","星期二","星期三","星期四","星期五","星期六"};
        int week = cal.get(Calendar.DAY_OF_WEEK);
        week--;
        System.out.println(weeks[week]);

        //public final Date getTime()	获取日期对象。
        Date date = cal.getTime();
        System.out.println("date = " + date);
        //cal.setTime(new Date());

        //public long getTimeInMillis()	获取时间毫秒值
        System.out.println("cal.getTimeInMillis() = " + cal.getTimeInMillis());


        //public void set(int field,int value)	修改日历的某个信息。
        System.out.println("cal = " + cal);
        //cal.set(Calendar.MONTH,1);//修改成2月
        cal.set(Calendar.MONTH,12);//给的时间,超出了正常的最大范围,让时间整体,向后延续
        System.out.println("cal.get(Calendar.YEAR) = " + cal.get(Calendar.MONTH));
        System.out.println("cal = " + cal);


        //public void add(int field,int amount)	为某个信息增加/减少指定的值
        Calendar cal2 = Calendar.getInstance();
        //cal2.add(Calendar.DAY_OF_MONTH,-1);//让日减少1天
        cal2.add(Calendar.DAY_OF_MONTH,60);//让日减少1天
        System.out.println("cal2 = " + cal2);
    }
}
