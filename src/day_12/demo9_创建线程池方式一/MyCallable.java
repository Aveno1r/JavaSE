package day_12.demo9_创建线程池方式一;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"线程在执行..");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
