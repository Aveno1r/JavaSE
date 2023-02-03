package day_13self.demo3_UDP多收多发信息;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

// 接收端: 端口号7777
public class Receive {
    public static void main(String[] args) throws Exception{
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        while (true) {

        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);

        datagramSocket.receive(datagramPacket);

        //获得实际接受的字节个数

            int length = datagramPacket.getLength();

            //获取接收的数据，打印输出
            String msg = new String(bytes, 0, length);
            System.out.println("msg = " + msg);
        }
//        datagramSocket.close();

    }
}
