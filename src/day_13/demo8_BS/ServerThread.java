package day_13.demo8_BS;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerThread extends Thread {
    Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 通过socket对象获得字节输出流
            OutputStream os = socket.getOutputStream();
            // 把字节输出流转换为打印流
            PrintStream ps = new PrintStream(os);
            // 按照http协议规则写数据给浏览器
            ps.println("HTTP/1.1   200   OK");
            ps.println("Content-Type : text/html;charset=UTF-8");
            ps.println();
            ps.println("<div style=\"color: red;font-size: 120px;text-align: center\">黑马程序员666</div>");
            // 刷新数据
            ps.flush();

            // 释放资源
            ps.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
