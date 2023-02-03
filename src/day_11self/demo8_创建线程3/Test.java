package day_11self.demo8_创建线程3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
            创建线程方式三: 利用Callable接口、FutureTask类来实现
                创建FutureTask任务对象
                    定义一个类实现Callable接口，重写call方法，封装要做的事情，和要返回的数据。
                    把Callable类型的对象封装成FutureTask（线程任务对象）。
                把FutureTask任务对象交给Thread对象。
                调用Thread对象的start方法启动线程。
                线程执行完毕后、通过FutureTask对象的的get方法去获取线程任务执行的结果。


         FutureTask<V>类: 实现Runnable接口
                public FutureTask(Callable<V> callable)
                public V get(); 获取Callable接口的call方法的返回值
         */
        MyCallable myCallable = new MyCallable(10);
        FutureTask<Integer> futureTask = new FutureTask<Integer>(myCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
        // 线程执行完毕后: 通过FutureTask对象的的get方法去获取线程任务执行的结果。
        // 如果上面的子线程没有执行完,下面的get方法会阻塞
        // 只有上面的线程任务代码执行完毕,下面的get方法才会执行
        Integer result = futureTask.get();
        System.out.println("result = " + result);

        MyCallable myCallable1 = new MyCallable(100);
        FutureTask<Integer> futureTask1 = new FutureTask<Integer>(myCallable1);
        Thread thread1 = new Thread(futureTask1);
        thread1.start();
        Integer result1 = futureTask1.get();
        System.out.println("result1 = " + result1);
    }
}
