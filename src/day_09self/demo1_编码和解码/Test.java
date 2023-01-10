package day_09self.demo1_编码和解码;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 使用java代码对字符进行编码: 字符-->字节
        String str = "s沈潇x";
        // byte[] getBytes(); 使用平台默认的字符集对字符串数据进行编码
        byte[] bytes = str.getBytes();
        System.out.println("bytes = " + Arrays.toString(bytes));
        // byte[] getBytes(String charsetName); 使用指定的字符集对字符串数据进行编码
        byte[] bytes1 = str.getBytes("gbk");
        System.out.println("bytes1 = " + Arrays.toString(bytes1));

        System.out.println("------------------------");
        // 使用java代码对字节数据进行解码: 字节-->字符
        // public String(byte[] bytes); 使用平台默认的字符集对字节数据进行解码
        String s = new String(bytes);
        System.out.println("s = " + s);

        String s1 = new String(bytes1);
        System.out.println("s1 = " + s1); ///s1 = s����x 乱码，因为上面是s1使用的gbk编码，而
        //idea默认使用utf-8编码，所以会出现乱码，编码和解码的过程需要使用同一种编码，不然就会出现乱码
        String s11 = new String(bytes1, "gbk");
        System.out.println("s11 = " + s11);//s11 = s沈潇x  修改默认编码后，正确运行。

    }
}