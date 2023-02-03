package day_13.demo4_TCP收发信息;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

// ServerSocket服务端: 接收数据
public class Server {
    public static void main(String[] args) throws Exception{
        // 端口号:7777
        // 创建ServerSocket对象,指定服务器的端口号
        Socket socket = null;// 阻塞
        DataInputStream dis = null;

            ServerSocket ss = new ServerSocket(8888);
        while (true) {
            // 调用accept方法接收请求,建立连接,得到socket对象,连接没有建立成功,方法会阻塞
            System.out.println("连接上了");
            socket = ss.accept();
            System.out.println("服务器socket = " + socket);

            // 通过socket获得字节输入流对象,关联连接通道
            InputStream is = socket.getInputStream();

            // 把字节输入流包装为数据输入流
            dis = new DataInputStream(is);

            // 读客户端写过来的数据---接收数据
            String msg = dis.readUTF();
            System.out.println("msg = " + msg);
        }

        // 释放资源
//        dis.close();
//        socket.close();

    }
}
