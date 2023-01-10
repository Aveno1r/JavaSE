package day_04.d2Api_System;

public class Test {
    public static void main(String[] args) {
        //public static void exit​(int status)	终止当前运行的Java虚拟机。
        System.out.println("开始");
        //System.exit(-1);//statu表示的是结束时的状态  0表示正常结束
        System.out.println("结束");

        //public static long currentTimeMillis​()	    返回当前系统的时间毫秒值形式
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());

        //计算程序运行使用的时间
        long start = System.currentTimeMillis();
        //做一些事情
        long end = System.currentTimeMillis();
        long useTime = end-start;

    }
}
