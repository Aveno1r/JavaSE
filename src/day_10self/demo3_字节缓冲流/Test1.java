package day_10self.demo3_字节缓冲流;

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
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\2.wav"));
                // 2.创建字节缓冲输出流对象,关联目的地文件
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\output\\2.wav"));

        ){
            // 3.定义一个int变量,用来存储读取到的字节数据
            int a;
            // 4.循环读字节数据
            while ((a = bis.read()) != -1){
                // 5.写字节数据
                bos.write(a);
            }

        }  catch (IOException e) {
            throw new RuntimeException(e);
        }


        // 7.获取当前时间距离标准时间的毫秒值
        long end = System.currentTimeMillis();
        // 8.计算2个时间差
        long time = end - start;
        System.out.println("start = " + start);
        System.out.println("end = " + end);
        System.out.println("time = " + time);
    }
}
