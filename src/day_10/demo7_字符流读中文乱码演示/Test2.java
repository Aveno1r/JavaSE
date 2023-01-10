package day_10.demo7_字符流读中文乱码演示;

import java.io.FileReader;

public class Test2 {
    public static void main(String[] args) {

        try (
                // 1.创建字符输入流对象,关联数据源文件
                //FileReader fr = new FileReader("day10\\eee\\utf8.txt");// 由于FileReader使用的是utf8编码,utf8.txt也是utf8编码,所以不乱码
                FileReader fr = new FileReader("day10\\eee\\gbk.txt");// 由于FileReader使用的是utf8编码,gbk.txt是gbk编码,所以乱码
            ){

            // 2.定义一个char类型的数组,用来存储读取到的字符数据
            char[] chs = new char[2];

            // 定义一个int变量,用来存储读取到的字符个数
            int len;

            // 循环读字符数据
            while ((len = fr.read(chs)) != -1){
                System.out.println(new String(chs,0,len));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
