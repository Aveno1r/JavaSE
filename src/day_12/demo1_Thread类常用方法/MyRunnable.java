package day_12.demo1_Thread类常用方法;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        // 获取当前正在执行的线程对象
        Thread t = Thread.currentThread();
        // 获取当前线程的名称,打印输出
        System.out.println(t.getName() + "正在执行MyRunnable任务代码...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
