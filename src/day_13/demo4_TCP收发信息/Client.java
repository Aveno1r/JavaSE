package day_13.demo4_TCP收发信息;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

// Socket客户端: 发送数据
public class Client {
    public static void main(String[] args) throws Exception{
        /*
            Socket类:
                public Socket(String host, int port);创建Socket对象,指定要连接的服务器的ip地址和端口号
                    注意:该方法会自动连接服务器,连接成功返回Socket对象,连接失败报异常
                public OutputStream getOutputStream();获得字节输出流对象,关联连接通道
                public InputStream getInputStream();获得字节输入流对象,关联连接通道
         */
        // 创建Socket对象表示客户端,指定服务端的ip地址和端口号(自动与服务器建立连接)
        Socket socket = null;
        DataOutputStream dos = null;
        while (true) {
            socket = new Socket("42.194.197.249",8888);
            System.out.println("客户端socket = " + socket);

            // 通过Socket对象获得字节输出流对象,关联连接通道
            OutputStream os = socket.getOutputStream();
            // 把字节输出流包装为数据输出流
            dos = new DataOutputStream(os);

            // 写数据给服务器---发送数据
            Scanner sc = new Scanner(System.in);
            System.out.println("输入你想说的话:");
            String msg = sc.next();
            dos.writeUTF(msg);
        }

        // 释放资源
        // dis.close();
        ////        socket.close();

    }
}
