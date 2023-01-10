package day_10.demo1_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

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
                // 1.创建字符输入流对象,关联数据源文件
                FileReader fr = new FileReader("day10\\aaa\\a.txt");
            ){

            // 2.读字符数据
            //int c1 = fr.read();
            //System.out.println("c1 = " + c1);

            // 定义一个int变量,用来存储读取到的字符数据
            int c;

            // 循环读字符数据
            while ((c = fr.read()) != -1){
                System.out.println("c = " + (char)c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
