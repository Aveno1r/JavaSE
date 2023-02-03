package day_13self.demo2_UDP收发消息;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receive {

     public static void main(String[] args) throws IOException {
         /*
       DatagramSocket类:
         public DatagramSocket(int port); 创建DatagramSocket对象,指定端口号
         public synchronized void receive(DatagramPacket p);接收数据包

       DatagramPacket类:
         public DatagramPacket(byte buf[], int length);用来接收数据包中的数据
         public synchronized int getLength();获取实际接收的字节个数
  */
         DatagramSocket datagramSocket = new DatagramSocket(8888);
         byte[] bytes = new byte[1024];
         DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);

         datagramSocket.receive(datagramPacket);

         //获得实际接受的字节个数
         int length = datagramPacket.getLength();

         //获取接收的数据，打印输出
         String msg = new String(bytes, 0, length);
         System.out.println("msg = " + msg);
         datagramSocket.close();
     }
}
