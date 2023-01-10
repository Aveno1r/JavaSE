package day_10.demo1_FileReader;

import java.io.FileReader;

public class Test2 {
    public static void main(String[] args) {
        /*
            FileReader:字符输入流,用来读字符数据
                构造方法:
                    public FileReader(File file);
                    public FileReader(String fileName);
               成员方法:
                    public int read(char[] chs);每次读一个字符数组,把读取到的字符数据存储到字符数组中,
                                                并返回读取到的字符个数,如果读取不到数据了,就返回-1作为标识
         */
        // 需求: 使用字符输入流读day10\aaa\a.txt文件中的所有字符数据
        try (
                // 1.创建字符输入流对象,关联数据源文件
                FileReader fr = new FileReader("day10\\aaa\\a.txt");// 由于FileReader使用的是utf8编码,a.txt也是utf8编码,所以不乱码
                //FileReader fr = new FileReader("C:\\Users\\pzl\\Desktop\\gbk.txt");// 由于FileReader使用的是utf8编码,gbk.txt是gbk编码,所以乱码
            ){

            // 2.定义一个char类型的数组,用来存储读取到的字符数据
            char[] chs = new char[2];

            // 定义一个int变量,用来存储读取到的字符个数
            int len;

            // 循环读字符数据
            while ((len = fr.read(chs)) != -1){
                System.out.println(new String(chs,0,len));
            }

            /*int len = fr.read(chs);
            System.out.println("len = " + len);// 2
            System.out.println("chs = " + new String(chs,0,len));*/


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
