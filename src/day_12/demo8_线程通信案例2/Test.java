package day_12.demo8_线程通信案例2;

public class Test {
    public static void main(String[] args) {
         /*
            规律执行: 生产线程生产1个包子,吃货线程吃1个包子
            分析:
                生产线程生产1个包子,进入等待,唤醒吃货线程来吃包子
                吃货线程吃1个包子,进入等待,唤醒线程生产线程来生产包子

           设计: 设计一个开关变量,用来作为生产线程和吃货线程线程是否执行的标志
           实现:
                1.设计一个boolean类型的开关变量,true表示吃货线程执行,false表示生产线程执行
                2.如果开关变量的值为true,那么生产线程就得无限等待,如果为false,生产就要执行
                2.如果开关变量的值为false,那么吃货线程就得无限等待,如果为true,吃货线程就要执行
         */
        BaoZi bz = new BaoZi();
        BaoZiPuThread baoZiPuThread = new BaoZiPuThread(bz);
        ChiHuoThread chiHuoThread = new ChiHuoThread(bz);
        baoZiPuThread.start();
        chiHuoThread.start();
    }
}
