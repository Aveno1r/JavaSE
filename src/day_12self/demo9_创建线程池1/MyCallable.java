package day_12self.demo9_创建线程池1;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}
