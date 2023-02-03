package day_13self.demo5_TCP多收多发信息;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8888);
        System.out.println(1);
        Socket socket = ss.accept();
        System.out.println("socket = " + socket);

        InputStream is = socket.getInputStream();

        DataInputStream dis = new DataInputStream(is);

        while (true) {
            try {
                String msg = dis.readUTF();
                System.out.println("msg = " + msg);
            } catch (IOException e) {
                dis.close();
                socket.close();
                break;
            }
        }
    }
}
