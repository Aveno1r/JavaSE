package day_09self.demo11_IO异常处理方式一;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        // 方式一: 使用try...catch...finally方式处理异常
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // 1.创建字节输入流对象,关联数据源文件
           fis = new FileInputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\1.jpg");
            // 2.创建字节输出流对象,关联目的地文件
            fos = new FileOutputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\output\\11.jpg");
            // 3.定义一个字节数组,用来存储读取到的字节数据
            byte[] bytes = new byte[8042];
            // 3.定义一个int类型的变量,用来存储读取到的字节个数
            int len;
            // 4.循环读字节数据
            while ((len = fis.read(bytes)) != -1){
                fos.write(bytes,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            // 6.关闭流,释放资源
            if (fis == null){
                fis.close();
            }
            if (fos == null){
                fos.close();
            }
        }

    }
}
