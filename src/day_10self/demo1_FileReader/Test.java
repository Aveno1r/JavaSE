package day_10self.demo1_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        /*
            FileReader:字符输入流,用来读字符数据
                构造方法:
                    public FileReader(File file);
                    public FileReader(String fileName);
               成员方法:
                    public int read();每次读一个字符,并返回读取到的字符数据,如果读取不到数据了,就返回-1作为标识
         */
        // 需求: 使用字符输入流读day10\aaa\a.txt文件中的所有字符数据
        try (
                FileReader fr = new FileReader("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\1.txt");
        ){
           int len;
           while ((len = fr.read()) != -1){
               System.out.println((char) len);
           }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
