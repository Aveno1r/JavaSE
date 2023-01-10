package day_09.demo4_字节输入流一次读取完全部字节;

import java.io.File;
import java.io.FileInputStream;

public class Test1 {
    public static void main(String[] args) throws Exception{
        // 方式一: 自己定义一个字节数组与被读取的文件大小一样大，然后使用该字节数组，一次读完文件的全部字节
        // 1.创建字节输入流对象,关联数据源文件
        FileInputStream fis = new FileInputStream("day09\\input\\b.txt");

        // 2.定义一个与被读取的文件大小一样大的字节数组
        File file = new File("day09\\input\\b.txt");
        long size = file.length();
        byte[] bytes = new byte[(int)size];

        // 3.一次读完整个文件的全部字节
        int len = fis.read(bytes);

        // 4.转换为字符串
        String s = new String(bytes, 0, len);
        System.out.println("s = " + s);

        // 5.关闭流,释放资源
        fis.close();

    }
}
