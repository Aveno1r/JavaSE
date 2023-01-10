package day_10.demo3_字节缓冲流;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        /*
            字节缓冲流:
                public BufferedInputStream(InputStream in);
                public BufferedOutputStream(OutputStream out);
         */
        // 需求: 使用字节缓冲流一次读写一个字节拷贝文件,计算所花的时间
        // 0.获取当前时间距离标准时间的毫秒值
        long start = System.currentTimeMillis();

        try (
                // 1.创建字节缓冲输入流对象,关联数据源文件
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day10\\ccc\\1.wmv"));
                // 2.创建字节缓冲输出流对象,关联目的地文件
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day10\\ccc\\1Copy1.wmv"));
            ){

            // 3.定义一个int变量,用来存储读取到的字节数据
            int b;
            // 4.循环读字节数据
            while ((b = bis.read()) != -1){
                // 5.写字节数据
                bos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 7.获取当前时间距离标准时间的毫秒值
        long end = System.currentTimeMillis();

        // 8.计算2个时间差
        System.out.println("总共花了:" + (end - start) + "毫秒");// 总共花了:873毫秒
    }
}
