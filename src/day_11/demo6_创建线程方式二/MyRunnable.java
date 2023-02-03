package day_11.demo6_创建线程方式二;

// 任务类
public class MyRunnable implements Runnable{

    //run方法用来存储线程要执行的任务代码

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }
}
