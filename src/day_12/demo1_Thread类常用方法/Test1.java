package day_12.demo1_Thread类常用方法;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        /*
            Thread类:
                构造方法:
                    public Thread();创建线程对象,由系统自动生成线程名
                    public Thread(String name);创建线程对象,自定义线程名
                    public Thread(Runnable target);创建线程对象,由系统自动生成线程名
                    public Thread(Runnable target,String name);创建线程对象,自定义线程名
                成员方法:
                   public static native Thread currentThread();获取当前执行的线程对象
                   public String getName();获取当前线程的名称
                   public void setName(String name);设置当前线程的名称
                   public final void join();让调用当前这个方法的线程先执行完
                   public static void sleep(long time);让当前执行的线程休眠多少毫秒后，再继续执行
         */
        MyThread mt = new MyThread();
        mt.setName("1号线程");
        mt.start();
        mt.join();

        MyThread mt2 = new MyThread("2号线程");
        mt2.start();
        mt2.join();

        MyRunnable mr = new MyRunnable();
        Thread t3 = new Thread(mr);
        t3.start();
        t3.join();

        Thread t4 = new Thread(mr, "4号线程");
        t4.start();
        t4.join();

    }
}
