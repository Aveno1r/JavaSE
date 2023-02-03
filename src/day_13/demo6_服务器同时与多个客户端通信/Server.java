package day_13.demo6_服务器同时与多个客户端通信;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

// ServerSocket服务端: 接收数据
public class Server {
    public static void main(String[] args) throws Exception{
        // 端口号:7777
        // 创建ServerSocket对象,指定服务器的端口号
        ServerSocket ss = new ServerSocket(7777);


        // 循环接收客户端请求
        while (true) {
            // 调用accept方法接收请求,建立连接,得到socket对象,连接没有建立成功,方法会阻塞
            System.out.println(1);
            Socket socket = ss.accept();// 阻塞
            System.out.println("服务器socket = " + socket);

            // 和客户端建立连接之后,需要开启线程去接收客户端发过来的信息
            new ServerThread(socket).start();
        }

        // 释放资源
        //dis.close();
        //socket.close();

    }
}
