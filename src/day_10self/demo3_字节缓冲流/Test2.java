package day_10self.demo3_字节缓冲流;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        /*
            普通字节流:

         */
        // 需求: 使用普通字节流一次读写一个字节拷贝文件,计算所花的时间
        // 0.获取当前时间距离标准时间的毫秒值
        long start = System.currentTimeMillis();




        try (
                FileInputStream fis = new FileInputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\2.wav");

                FileOutputStream fos = new FileOutputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\output\\2.wav");

        ){
            // 3.定义一个int变量,用来存储读取到的字节数据

            // 4.循环读字节数据

            // 5.写字节数据
            int a;
            while ((a = fis.read()) != -1){
                fos.write(a);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 7.获取当前时间距离标准时间的毫秒值
        long end = System.currentTimeMillis();

        // 8.计算2个时间差
        System.out.println("总共花了:" + (end - start) + "毫秒");// 总共花了:大概几分钟
    }
}
