package day_13.demo8_BS;

import java.net.ServerSocket;
import java.net.Socket;

public class BSServer {
    public static void main(String[] args) throws Exception{
        // 创建ServerSocket对象,指定服务器的端口号: 8080
        ServerSocket ss = new ServerSocket(8080);

        // 循环接收多个浏览器的请求
        while (true){
            // 接收请求,建立连接,得到Socket对象
            Socket socket = ss.accept();

            // 开启线程,把页面信息写给浏览器
            new ServerThread(socket).start();
        }


    }
}
