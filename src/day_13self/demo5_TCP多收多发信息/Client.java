package day_13self.demo5_TCP多收多发信息;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 8888);
        System.out.println("socket = " + socket);
        //通过Socket对象获得字节输出流对象，关联连接通道
        OutputStream os = socket.getOutputStream();
        //把字节输出流包装为数据输出流
        DataOutputStream dos = new DataOutputStream(os);

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("说话:");
            String msg = sc.next();

            if (msg.equals("exit")){
                System.out.println("客户端退出");
                dos.close();
                socket.close();
                break;
            }
            dos.writeUTF(msg);
        }
    }
}
