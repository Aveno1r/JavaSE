package day_09self.demo4_字节输入流一次读取完全部字节;

import java.io.File;
import java.io.FileInputStream;

public class Test1 {
    public static void main(String[] args) throws Exception{
        // 方式一: 自己定义一个字节数组与被读取的文件大小一样大，然后使用该字节数组，一次读完文件的全部字节
        // 1.创建字节输入流对象,关联数据源文件
        FileInputStream fis = new FileInputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\a.txt");
// 2.定义一个与被读取的文件大小一样大的字节数组\
        File file = new File("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\a.txt");
        long size = file.length();
        byte[] bytes = new byte[(int) size];

        int len = fis.read(bytes);

        String s = new String(bytes);
        System.out.println(s);

        // 5.关闭流,释放资源
        fis.close();

    }
}
