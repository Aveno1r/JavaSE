package day_12self.demo10_创建线程池方式二;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 使用工具类创建固定数量线程的线程池
        ExecutorService es = Executors.newFixedThreadPool(3);

        // 创建任务对象
        MyCallable mc = new MyCallable(100);

        // 提交任务,执行任务
        Future<Integer> f1 = es.submit(mc);
        System.out.println("1-100的累加和: " + f1.get());

        Future<Integer> f2 = es.submit(mc);
        System.out.println("1-100的累加和: " + f2.get());

        Future<Integer> f3 = es.submit(mc);
        System.out.println("1-100的累加和: " + f3.get());

        Future<Integer> f4 = es.submit(mc);
        System.out.println("1-100的累加和: " + f4.get());
    }
}
