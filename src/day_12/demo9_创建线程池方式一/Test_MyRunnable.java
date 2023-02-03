package day_12.demo9_创建线程池方式一;

import java.util.concurrent.*;

public class Test_MyRunnable {
    public static void main(String[] args) {
        /*
            线程池处理Runnable任务:
                ExecutorService接口的方法:
                    public void execute(Runnable command);执行Runnable任务
                    public void shutdown();等全部任务执行完毕后，再关闭线程池！
                    public List<Runnable> shutdownNow();立刻关闭线程池，停止正在执行的任务，并返回队列中未执行的任务
         */
        // 创建线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,// 核心线程数---工作线程数
                5,// 线程池最大线程数 = 核心线程数 + 临时线程数  临时线程2个
                8,// 临时线程最大空闲时间,意思就是临时线程空闲8秒,就会被销毁
                TimeUnit.SECONDS,// 临时线程最大空闲时间的单位
                new ArrayBlockingQueue<>(4),// 任务阻塞队列: 没有来得及处理的任务就添加到任务阻塞队列中等待
                Executors.defaultThreadFactory(),// 线程池工厂对象: 用来创建线程对象的
                //new ThreadPoolExecutor.AbortPolicy() // 拒绝策略: 所有线程都在忙,并且任务队列都满了,还有新的任务要处理时的拒绝策略
                new ThreadPoolExecutor.CallerRunsPolicy() // 拒绝策略: 所有线程都在忙,并且任务队列都满了,还有新的任务要处理时的拒绝策略
                //new ThreadPoolExecutor.DiscardPolicy() // 拒绝策略: 所有线程都在忙,并且任务队列都满了,还有新的任务要处理时的拒绝策略
        );
        // 临时线程什么时候创建:  新任务提交时发现核心线程都在忙，任务队列也满了，并且还可以创建临时线程，此时才会创建临时线程。
        // 什么时候会开始拒绝新任务: 核心线程和临时线程都在忙，任务队列也满了，新的任务过来的时候才会开始拒绝任务。

        // 创建任务对象
        MyRunnable mr = new MyRunnable();
        // 使用线程池执行Runnable任务
        pool.execute(mr);// 线程池会自动创建一个核心线程,自动执行任务
        pool.execute(mr);// 线程池会自动创建一个核心线程,自动执行任务
        pool.execute(mr);// 线程池会自动创建一个核心线程,自动执行任务

        // 核心线程都在忙,新任务就会添加到任务队列中,进行等待空闲的核心线程来处理
        pool.execute(mr);
        pool.execute(mr);
        pool.execute(mr);
        pool.execute(mr);

        // 核心线程都在忙，任务队列也满了，并且还可以创建临时线程
        // 到了创建临时线程的时候
        pool.execute(mr);
        pool.execute(mr);

        // 核心线程和临时线程都在忙，任务队列也满了
        // 到了拒绝新任务的时候了
        pool.execute(mr);

        // 关闭线程池
        //pool.shutdown();// 等全部任务执行完毕后，再关闭线程池！
        //pool.shutdownNow();// 立刻关闭线程池，停止正在执行的任务，并返回队列中未执行的任务


    }
}
