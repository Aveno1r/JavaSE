package day_11self.demo8_创建线程3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public Object call() throws Exception {
        System.out.println("------");
        int sum = 0;
        Thread.sleep(3000);
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
