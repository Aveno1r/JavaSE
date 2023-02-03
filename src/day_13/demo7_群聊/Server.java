package day_13.demo7_群聊;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

// ServerSocket服务端: 接收数据
public class Server {

    // 静态成员变量集合
    public static ArrayList<Socket> onLineSockets = new ArrayList<>();

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

            // 建立连接之后,把socket存储到集合中
            onLineSockets.add(socket);

            // 和客户端建立连接之后,需要开启线程去接收客户端发过来的信息
            new ServerThread(socket).start();
        }

        // 释放资源
        //dis.close();
        //socket.close();

    }
}
