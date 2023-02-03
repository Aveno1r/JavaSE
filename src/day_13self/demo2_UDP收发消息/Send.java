package day_13self.demo2_UDP收发消息;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Send {
    public static void main(String[] args) throws IOException {

        /*
            DatagramSocket类:
                public DatagramSocket(); 创建DatagramSocket对象,由系统随机分配一个端口号
                public DatagramSocket(int port); 创建DatagramSocket对象,指定端口号
                public void send(DatagramPacket p);发送数据包

            DatagramPacket类:
                public DatagramPacket(byte buf[], int length,InetAddress address, int port);用来封装要发送的数据和目的地ip,端口号
                    参数1:要发送的数据
                    参数2:要发送的字节数据的个数
                    参数3:接收端的ip地址对象
                    参数4:接收端的端口号
         */
        DatagramSocket datagramSocket = new DatagramSocket();

        //准备要发送的数据和把数据封装到数据包
        String msg = "shabi";
        byte[] bytes = msg.getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(),8888);

        datagramSocket.send(datagramPacket);

        datagramSocket.close();
    }
}
