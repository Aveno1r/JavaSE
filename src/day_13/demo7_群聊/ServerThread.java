package day_13.demo7_群聊;

import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread{
    Socket socket;

    public ServerThread(Socket socket) {
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

                    // 读到数据之后,需要遍历集合中所有在线的socket
                    // 通过这些socket把数据写给对应的客户端
                    for (Socket onLineSocket : Server.onLineSockets) {
                        // 通过onLineSocket获取字节输出流
                        OutputStream os = onLineSocket.getOutputStream();
                        // 转换为数据输出流
                        DataOutputStream dos = new DataOutputStream(os);
                        // 把数据写出去
                        dos.writeUTF(msg);
                        // 刷新数据
                        dos.flush();
                    }

                } catch (IOException e) {
                    // 出现异常:
                    // 哪个客户端退出了\下线了
                    System.out.println(socket.getRemoteSocketAddress() + ",端口号:" + socket.getPort() + ",该客户端退出了...");
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
