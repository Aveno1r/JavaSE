package day_09.demo11_IO异常处理方式一;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        // 方式一: 使用try...catch...finally方式处理异常
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            // 1.创建字节输入流对象,关联数据源文件
            fis = new FileInputStream("day09\\input\\mm.jpg");

            // 2.创建字节输出流对象,关联目的地文件
            fos = new FileOutputStream("day09\\output\\mm3.jpg");

            // 3.定义一个字节数组,用来存储读取到的字节数据
            byte[] bytes = new byte[8192];

            // 3.定义一个int类型的变量,用来存储读取到的字节个数
            int len;

            // 4.循环读字节数据
            while ((len = fis.read(bytes)) != -1) {
                // 5.在循环中,写字节数据
                fos.write(bytes,0,len);
            }
        }catch (Exception e){
            System.out.println("异常信息: "+e.getMessage());
        }finally {
            // 6.关闭流,释放资源
            try {
                if (fos != null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
