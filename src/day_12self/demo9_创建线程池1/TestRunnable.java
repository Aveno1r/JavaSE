package day_12self.demo9_创建线程池1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestRunnable {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                5,
                8,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        MyRunnable myRunnable = new MyRunnable();
        //占用核心线程
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        //任务队列排队
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        //核心线程和任务队列都满了后，创建临时线程
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        //任务队列和核心线程，临时线程都满了，执行拒绝策略
        pool.execute(myRunnable);
    }
}
