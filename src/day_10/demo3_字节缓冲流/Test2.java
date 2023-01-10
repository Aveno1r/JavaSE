package day_10.demo3_字节缓冲流;

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
                // 1.创建字节输入流对象,关联数据源文件
                FileInputStream fis = new FileInputStream("day10\\ccc\\1.wmv");
                // 2.创建字节输出流对象,关联目的地文件
                FileOutputStream fos = new FileOutputStream("day10\\ccc\\1Copy2.wmv");
        ){

            // 3.定义一个int变量,用来存储读取到的字节数据
            int b;
            // 4.循环读字节数据
            while ((b = fis.read()) != -1){
                // 5.写字节数据
                fos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 7.获取当前时间距离标准时间的毫秒值
        long end = System.currentTimeMillis();

        // 8.计算2个时间差
        System.out.println("总共花了:" + (end - start) + "毫秒");// 总共花了:大概几分钟
    }
}
