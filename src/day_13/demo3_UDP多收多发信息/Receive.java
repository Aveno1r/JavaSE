package day_13.demo3_UDP多收多发信息;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

// 接收端: 端口号7777
public class Receive {
    public static void main(String[] args) throws Exception{
        // 创建DatagramSocket对象,指定端口号
        DatagramSocket socket = new DatagramSocket(7777);

        // 循环接收数据
        while (true) {
            // 准备数据包接收发送过来的数据包中的数据
            byte[] bytes = new byte[1024];
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length);

            // 接收数据包
            socket.receive(packet);

            // 获取实际接收的字节个数
            int len = packet.getLength();

            // 获取接收的数据,打印输出
            String msg = new String(bytes,0,len);
            System.out.println("msg = " + msg);
        }

        // 释放资源
        //socket.close();

    }
}
