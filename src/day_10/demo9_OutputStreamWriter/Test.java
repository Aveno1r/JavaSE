package day_10.demo9_OutputStreamWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test {
    public static void main(String[] args) {
        /*
            public OutputStreamWriter(OutputStream out, String charsetName);创建字符转换输出流对象,指定编码
         */
        try (
                // 创建字符转换输出流对象,关联目的地文件
                //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10\\eee\\utf8_1.txt"), "utf8");
                OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10\\eee\\gbk_1.txt",true), "gbk");
            ){
            // 写字符数据
            osw.write("中国你好");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
