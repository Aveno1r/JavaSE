package day_11.demo7_创建线程方式二;


public class Test {
    public static void main(String[] args) {
        /*
            创建线程方式二: 通过实现Runnable方式
                创建Runnable的匿名内部类对象
                把Runnable的匿名内部类对象交给Thread处理。
                调用线程对象的start()方法启动线程
         */
        // 创建Thread线程对象,把Runnable的匿名内部类对象交给Thread处理。
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("i = " + i);
                }
            }
        });

        // 调用线程对象的start()方法启动线程
        t.start();

        // 主线程代码
        for (int j = 0; j < 10; j++) {
            System.out.println("j = " + j);
        }
    }
}
