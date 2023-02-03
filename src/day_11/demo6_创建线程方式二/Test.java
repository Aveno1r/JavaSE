package day_11.demo6_创建线程方式二;

public class Test {
    public static void main(String[] args) {
        /*
            创建线程方式二: 通过实现Runnable方式
                定义一个线程任务类MyRunnable实现Runnable接口，重写run()方法
                创建MyRunnable任务对象
                把MyRunnable任务对象交给Thread处理。
                调用线程对象的start()方法启动线程
         */
        // 创建MyRunnable任务对象
        MyRunnable mr = new MyRunnable();

        // 创建Thread线程对象,把MyRunnable任务对象交给Thread处理
        Thread t = new Thread(mr);

        // 调用线程对象的start()方法启动线程
        t.start();

        // 主线程代码
        for (int j = 0; j < 10; j++) {
            System.out.println("j = " + j);
        }
    }
}
