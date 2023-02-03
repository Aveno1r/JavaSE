package day_13self.demo4_TCP收发信息;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        /*
            Socket类:
                public Socket(String host, int port);创建Socket对象,指定要连接的服务器的ip地址和端口号
                    注意:该方法会自动连接服务器,连接成功返回Socket对象,连接失败报异常
                public OutputStream getOutputStream();获得字节输出流对象,关联连接通道
                public InputStream getInputStream();获得字节输入流对象,关联连接通道
         */
        Socket socket = new Socket("127.0.0.1", 8888);

        while (true) {
            OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

            Scanner sc = new Scanner(System.in);
            System.out.println("输入你想说的话:");
            String str = sc.next();
            dataOutputStream.writeUTF(str);
        }
    }
}
