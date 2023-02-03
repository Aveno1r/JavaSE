package day_11.demo5_创建线程方式一;

// Thread类表示线程,MyThread继承Thread
// 所以MyThread类也表示线程,并拥有Thread类中所有的方法
public class MyThread extends Thread{
    // Thread类中有一个run方法,是用来存储线程要执行的代码(任务代码)
    @Override
    public void run() {
        // 线程要执行的代码
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }
}
