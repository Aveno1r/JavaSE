package day_10.demo8_InputStreamReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args){
        /*
            public InputStreamReader(InputStream in); 创建转换输入流对象,使用平台默认编码
            public InputStreamReader(InputStream in,String charset); 创建转换输入流对象,使用指定编码
         */
        try (
                // 创建转换输入流对象,关联数据源文件
                //InputStreamReader isr = new InputStreamReader(new FileInputStream("day10\\eee\\utf8.txt"),"utf8");// 不乱码
                InputStreamReader isr = new InputStreamReader(new FileInputStream("day10\\eee\\gbk.txt"),"gbk");// 不乱码
            ){

            // 2.定义一个char类型的数组,用来存储读取到的字符数据
            char[] chs = new char[2];

            // 定义一个int变量,用来存储读取到的字符个数
            int len;

            // 循环读字符数据
            while ((len = isr.read(chs)) != -1){
                System.out.println(new String(chs,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
