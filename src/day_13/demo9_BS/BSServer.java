package day_13.demo9_BS;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class BSServer {
    public static void main(String[] args) throws Exception{
        // 创建ServerSocket对象,指定服务器的端口号: 8080
        ServerSocket ss = new ServerSocket(8080);

        // 创建线程池
        ThreadPoolExecutor pools = new ThreadPoolExecutor(
               2,
               5,
               8,
               TimeUnit.SECONDS,
               new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );

        // 循环接收多个浏览器的请求
        while (true){
            // 接收请求,建立连接,得到Socket对象
            Socket socket = ss.accept();

            // 创建任务对象,把页面信息写给浏览器
            ServerRunnable sr = new ServerRunnable(socket);

            // 把任务对象添加到线程池中,让线程池分配线程来处理任务
            pools.execute(sr);
        }


    }
}
