package day_04self;

import java.util.Calendar;
import java.util.Date;

public class CalendarPra {
    public static void main(String[] args) {
        /*
        public static Calendar getInstance()	获取当前日历对象
        public int get(int field)	获取日历中的某个信息。
        public final Date getTime()	获取日期对象。
        public long getTimeInMillis()	获取时间毫秒值
        public void set(int field,int value)	修改日历的某个信息。
        public void add(int field,int amount)	为某个信息增加/减少指定的值
         */

        //注意：calendar是可变对象，一旦修改后其对象本身表示的时间将产生变化

        Calendar cal = Calendar.getInstance();
        System.out.println("cal.get(Calendar.DAY_OF_MONTH) = " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("cal.getTime() = " + cal.getTime());
        String[] weeks = {"星期天","星期一","星期二","星期三","星期四","星期五","星期六"};
        int week = cal.get(Calendar.DAY_OF_WEEK);
        week--;
        System.out.println(weeks[week]);
        System.out.println("cal.get(Calendar.DAY_OF_WEEK) = " + cal.get(Calendar.DAY_OF_WEEK));

        System.out.println("cal.getTimeInMillis() = " + cal.getTimeInMillis());
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());

        cal.set(Calendar.MONTH,11);
        System.out.println("cal.get(Calendar.MONTH) = " + cal.get(Calendar.MONTH));

        cal.add(Calendar.MONTH,1);
        System.out.println("cal.get(Calendar.MONTH) = " + cal.get(Calendar.MONTH));
    }
}
