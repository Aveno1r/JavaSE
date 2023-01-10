package day_10.demo2_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) {
        /*
            FileWriter:字符输出流,用来写字符数据到文件中
                构造方法:
                    public FileWriter(File file,boolean append);
                    public FileWriter(String fileName,boolean append);
                    注意事项:
                        1.如果文件不真实存在,就会创建一个新的空文件,但前提是该文件的所有父目录都必须真实存在
                        2.如果父目录不真实存在,就不会创建新的空文件,而是报文件找不到异常 FileNotFoundException
                        3.如果文件真实存在,并且第2个参数为false,就会清空该文件中的数据
                        4.如果文件真实存在,并且第2个参数为true,就不会清空该文件中的数据
                成员方法:
                    public void write(char[] chs,int off,int len);写一个字符数组的部分数据
         */
        try (
                // 1.创建字符输出流对象,关联目的地文件
                //FileWriter fw = new FileWriter("day10\\bbb\\d.txt",false);// 覆盖
                FileWriter fw = new FileWriter("day10\\bbb\\d.txt",true);// 追加续写
             ){
            // 2.写一个字符数组的部分数据
            char[] chs = {'a','b','c','d','中','国','牛','逼'};
            fw.write(chs,0,4);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
