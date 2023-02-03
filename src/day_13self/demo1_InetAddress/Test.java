package day_13self.demo1_InetAddress;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("localHost.getHostAddress() = " + localHost.getHostAddress());
        System.out.println("localHost.getHostName() = " + localHost.getHostName());
        boolean reachable = false;
        try {
            reachable = localHost.isReachable(3000);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("reachable = " + reachable);
        InetAddress address = InetAddress.getByName("www.youtube.com");
        boolean reachable1 = false;
        try {
            reachable1 = address.isReachable(3000);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("reachable1 = " + reachable1);
        System.out.println("InetAddress.getByName() = " + InetAddress.getByName("www.youtube.com"));

    }
}
