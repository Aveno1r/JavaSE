package day_12.demo1_Thread类常用方法;

public class MyThread extends Thread{

    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // 获取当前线程的名称,打印输出
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + "正在执行任务代码...");
        //System.out.println(getName() + "正在执行任务代码...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
