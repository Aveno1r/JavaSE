package day_13self.demo3_UDP多收多发信息;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

// 发送端
public class Send {
    public static void main(String[] args) throws Exception{
        DatagramSocket datagramSocket = new DatagramSocket();

        //准备要发送的数据和把数据封装到数据包
        while (true) {
            System.out.println("输入你想说的话:");
            Scanner sc = new Scanner(System.in);
            String msg = sc.next();
            byte[] bytes = msg.getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(),8888);

            datagramSocket.send(datagramPacket);
        }

    }
}
