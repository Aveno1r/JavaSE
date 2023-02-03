package day_12self.demo9_创建线程池1;

import java.util.concurrent.*;

public class TestCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,//核心线程数
                5,//最大线程数
                8,//临时线程存活时间8s，临时线程空闲的时间不能超过8s
                TimeUnit.SECONDS,//时间单位，对临时线程存活时间的描述
                new ArrayBlockingQueue<>(4),//任务阻塞队列，没有来的及执行的任务，在任务队列中等待
                Executors.defaultThreadFactory(),//用于创建线程的工厂对象
                new ThreadPoolExecutor.CallerRunsPolicy()//最大线程数和任务队列都满的时候，对新来的线程的拒绝策略
        );
        Future<Integer> s1 = pool.submit(new MyCallable(100));
        Future<Integer> s2 = pool.submit(new MyCallable(100));
        Future<Integer> s3 = pool.submit(new MyCallable(100));
        Future<Integer> s4 = pool.submit(new MyCallable(100));

        System.out.println("s1.get() = " + s1.get());
        System.out.println("s2.get() = " + s2.get());
        System.out.println("s3.get() = " + s3.get());
        System.out.println("s4.get() = " + s4.get());
    }
}
