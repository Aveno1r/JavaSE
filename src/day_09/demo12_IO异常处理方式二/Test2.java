package day_09.demo12_IO异常处理方式二;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test2 {
    public static void main(String[] args) {
        /*
            方式二: 使用try...with...resource处理IO异常
            格式:
                try(创建资源的代码){
                    可能会出现异常的代码
                }catch(异常类型 变量名){
                    出现异常之后要执行的代码
                }
         */
        try(
                // 1.创建字节输入流对象,关联数据源文件
                FileInputStream fis = new FileInputStream("day09\\input\\mm.jpg");

                // 2.创建字节输出流对象,关联目的地文件
                FileOutputStream fos = new FileOutputStream("day09\\output\\mm4.jpg");

            ){

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
            System.out.println("异常的信息: "+e.getMessage());
        }

        System.out.println("执行了吗");

    }
}
