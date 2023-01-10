package day_04.d5Api_Date;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //获取当前时间
        Date d = new Date();
        System.out.println("d = " + d);
        //根据指定毫秒值,获取时间对象
        //0L对应的1970年1月1日 0时0分0秒是欧洲的时区,二我们在东八区,差了8个小时
        Date d2 = new Date(0L);//1970年1月1日 8时0分0秒  东八区
        System.out.println("d2 = " + d2);

        //获取当前时间的毫秒值
        System.out.println("d.getTime() = " + d.getTime());
        System.out.println("d2.getTime() = " + d2.getTime());

        //指定当前时间的毫秒值
        d2.setTime(1000L);
        System.out.println("d2 = " + d2);
    }
}
