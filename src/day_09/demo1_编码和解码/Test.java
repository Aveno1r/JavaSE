package day_09.demo1_编码和解码;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 使用java代码对字符进行编码: 字符-->字节
        // 定义一个要编码的字符数据
        String s = "a我b";

        // byte[] getBytes(); 使用平台默认的字符集对字符串数据进行编码
        byte[] bytes = s.getBytes();// 猜一猜: 字节数组的长度是多少?  同学们猜: 由于使用的是utf8编码,所以长度是5
        System.out.println(Arrays.toString(bytes));// [97, -26, -120, -111, 98]

        // byte[] getBytes(String charsetName); 使用指定的字符集对字符串数据进行编码
        byte[] bytes2 = s.getBytes("gbk");// 指定gbk编码
        // // 猜一猜: 字节数组的长度是多少?  同学们猜: 由于使用的是gbk编码,所以长度是4
        System.out.println(Arrays.toString(bytes2));// [97, -50, -46, 98]

        System.out.println("------------------------------");

        // 使用java代码对字节数据进行解码: 字节-->字符
        // public String(byte[] bytes); 使用平台默认的字符集对字节数据进行解码
        String str1 = new String(bytes);// 默认使用的是utf8编码
        System.out.println("str1 = " + str1);// a我b

        //String str2 = new String(bytes2);
        //System.out.println("str2 = " + str2);// a��b  乱码-->因为bytes2是通过gbk编码得来的,现在使用的是utf8解码,编码和解码使用的编码不一致,所以会乱码

        // public String(byte bytes[], String charsetName);使用指定的字符集对字节数据进行解码
        String str2 = new String(bytes2, "gbk");
        System.out.println("str2 = " + str2);// a我b
    }
}
