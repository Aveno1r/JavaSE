package day_13self.demo4_TCP收发信息;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8888);
        Socket accept = socket.accept();

        InputStream inputStream = accept.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);

        while (true) {
            String str = dataInputStream.readUTF();

            System.out.println("str = " + str);
        }
    }
}
