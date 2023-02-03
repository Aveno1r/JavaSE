package day_13.demo3_UDP多收多发信息;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

// 发送端
public class Send {
    public static void main(String[] args) throws Exception{
        // 创建DatagramSocket对象,指定端口号
        DatagramSocket socket = new DatagramSocket();

        // 循环发送数据
        while (true) {
            // 输入要发送的数据
            Scanner sc = new Scanner(System.in);
            System.out.println("请说:");
            String msg = sc.next();
            byte[] bytes = msg.getBytes();

            // 结束判断
            if (msg.equals("exit")){
                System.out.println("欢迎下次再来!");
                socket.close();
                break;// 结束循环
            }

            // 把数据封装到数据包中
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),7777);

            // 发送数据包
            socket.send(packet);
        }

        // 释放资源
        //socket.close();

    }
}
