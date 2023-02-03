package day_12.demo9_创建线程池方式一;

import java.util.concurrent.*;

public class Test_MyCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                5,
                8,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );

        // 创建Callable任务对象
        MyCallable mc = new MyCallable(100);

        // 提交任务到线程池执行
        Future<Integer> f1 = pool.submit(mc);
        System.out.println("获取任务执行完毕的返回值: " + f1.get());

        Future<Integer> f2 = pool.submit(mc);
        System.out.println("获取任务执行完毕的返回值: " + f2.get());



    }
}
