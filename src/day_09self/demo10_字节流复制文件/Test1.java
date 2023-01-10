package day_09self.demo10_字节流复制文件;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test1 {
    public static void main(String[] args) throws Exception{
        // 方式一: 一次读写一个字节拷贝文件
        // 1.创建字节输入流对象,关联数据源文件
        FileInputStream fis = new FileInputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\1.jpg");

        // 2.创建字节输出流对象,关联目的地文件
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\output\\11.jpg");

        // 3.定义一个int类型的变量,用来存储读取到的字节数据
        int b;

        // 4.循环读字节数据
        while ((b = fis.read()) != -1) {
            // 5.在循环中,写字节数据
            fos.write(b);
        }

        // 6.关闭流,释放资源
        fos.close();
        fis.close();

    }
}
