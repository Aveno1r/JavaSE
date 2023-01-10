package day_10self.demo2_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        /*
            FileWriter:字符输出流,用来写字符数据到文件中
                构造方法:
                    public FileWriter(File file);
                    public FileWriter(String fileName);
                    注意事项:
                        1.如果文件不真实存在,就会创建一个新的空文件,但前提是该文件的所有父目录都必须真实存在
                        2.如果父目录不真实存在,就不会创建新的空文件,而是报文件找不到异常 FileNotFoundException
                        3.如果文件真实存在,会清空该文件中的数据
                成员方法:
                    public void write(String str);写一个字符串
         */

                // 1.创建字符输出流对象,关联目的地文件
        try(
                FileWriter fw = new FileWriter("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\output\\2.txt");
                ) {
            fw.write("rnmd");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 2.写一个字符串

    }
}
