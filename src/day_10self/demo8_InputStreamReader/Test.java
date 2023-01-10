package day_10self.demo8_InputStreamReader;

import java.io.*;

public class Test {
    public static void main(String[] args){
        /*
            public InputStreamReader(InputStream in); 创建转换输入流对象,使用平台默认编码
            public InputStreamReader(InputStream in,String charset); 创建转换输入流对象,使用指定编码
         */

                // 创建转换输入流对象,关联数据源文件
                //InputStreamReader isr = new InputStreamReader(new FileInputStream("day10\\eee\\utf8.txt"),"utf8");// 不乱码
        try (
                InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\gbk.txt"), "gbk");
        ){
            char[] chars = new char[2];
            int a;
            while ((a = isr.read(chars)) != -1){
                System.out.println(chars);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 2.定义一个char类型的数组,用来存储读取到的字符数据


            // 定义一个int变量,用来存储读取到的字符个数


            // 循环读字符数据


    }
}
