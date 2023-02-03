package day_11.demo8_创建线程方式三;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("call...");
        // 线程的任务代码: 计算一个数的累加和
        int sum = 0;

        //Thread.sleep(3000);
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
