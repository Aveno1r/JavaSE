package day_13.demo5_TCP多发多收信息;

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

        // 调用accept方法接收请求,建立连接,得到socket对象,连接没有建立成功,方法会阻塞
        System.out.println(1);
        Socket socket = ss.accept();// 阻塞
        System.out.println("服务器socket = " + socket);

        // 通过socket获得字节输入流对象,关联连接通道
        InputStream is = socket.getInputStream();

        // 把字节输入流包装为数据输入流
        DataInputStream dis = new DataInputStream(is);

        // 循环读数据
        while (true) {
            try {
                // 读客户端写过来的数据---接收数据
                String msg = dis.readUTF();
                System.out.println("msg = " + msg);
            } catch (IOException e) {
                // 出现异常:
                // 释放资源
                dis.close();
                socket.close();
                // 结束循环
                break;
            }
        }

        // 释放资源
        //dis.close();
        //socket.close();

    }
}
