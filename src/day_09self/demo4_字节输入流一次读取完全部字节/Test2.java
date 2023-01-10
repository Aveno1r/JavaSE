package day_09self.demo4_字节输入流一次读取完全部字节;

import java.io.FileInputStream;

public class Test2 {
    public static void main(String[] args) throws Exception{
        // 方式二:Java官方为InputStream提供了如下方法，可以直接把文件的全部字节读取到一个字节数组中返回
        // public byte[] readAllBytes(); 直接将当前字节输入流对应的文件对象的字节数据装到一个字节数组返回

        // 1.创建字节输入流对象,关联数据源文件
        FileInputStream fis = new FileInputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\a.txt");

        //    // 2.直接读所有字节数据
        byte[] bytes = fis.readAllBytes();
        String s = new String(bytes);
        System.out.println("s = " + s);
        // 4.关闭流,释放资源
        fis.close();

    }
}
