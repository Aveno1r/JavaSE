package day_13.demo1_InetAddress;

import java.net.InetAddress;

public class Test {
    public static void main(String[] args) throws Exception{
        // 1.获取本机地址对象
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println("ip1 = " + ip1);

        // 2.获取百度主机地址对象
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println("ip2 = " + ip2);

        // 3.获取主机名和ip地址
        System.out.println(ip1.getHostName() + " : " + ip1.getHostAddress());

        // 4.在指定毫秒内，判断主机与该ip对应的主机是否能连通
        boolean res = ip2.isReachable(3000);
        System.out.println("res = " + res);
    }
}
