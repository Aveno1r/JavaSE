package day_13.demo7_群聊;

import java.io.*;
import java.net.Socket;

public class ClientThread extends Thread{

    Socket socket;

    public ClientThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
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
                    //自己下线了
                    System.out.println("自己客户端退出了...");
                    // 释放资源
                    dis.close();
                    socket.close();// 断开连接
                    // 结束循环
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
