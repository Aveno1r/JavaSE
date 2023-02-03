package day_13.demo6_服务器同时与多个客户端通信;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

// Socket客户端: 发送数据
public class Client {
    public static void main(String[] args) throws Exception{
        // 创建Socket对象表示客户端,指定服务端的ip地址和端口号(自动与服务器建立连接)
        Socket socket = new Socket("127.0.0.1",7777);
        System.out.println("客户端socket = " + socket);

        // 通过Socket对象获得字节输出流对象,关联连接通道
        OutputStream os = socket.getOutputStream();
        // 把字节输出流包装为数据输出流
        DataOutputStream dos = new DataOutputStream(os);

        // 循环写数据
        while (true) {
            // 让用户输入要写的数据
            Scanner sc = new Scanner(System.in);
            System.out.println("请说:");
            String msg = sc.next();

            // 判断退出条件
            if (msg.equals("exit")){
                System.out.println("客户端退出了!");
                // 释放资源
                dos.close();
                socket.close();
                // 结束循环
                break;
            }

            // 写数据给服务器---发送数据
            dos.writeUTF(msg);
        }

        // 释放资源
        //dos.close();
        //socket.close();
    }
}
