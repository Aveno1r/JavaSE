package day_09.demo5_字节输出流写一个字节;

import java.io.File;
import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) throws Exception{
        /*
            FileOutputStream: 字节输出流,用来写字节数据到文件中
                构造方法:
                    public FileOutputStream(File file);
                    public FileOutputStream(String pathName);
                    注意:
                        1.如果指定的文件不存在,字节输出流会自动创建一个新的空文件,但前提是父目录必须真实存在
                        2.如果父目录不存在,字节输出流不会自动创建该新的空文件,报文件找不到异常
                        3.如果文件存在,就会清空该文件中的所有数据
               成员方法:
                    public void write(int b);写一个字节数据
                    public void close();关闭流,释放资源
         */
        // 1.创建字节输出流对象,关联目的地文件
        //FileOutputStream fos = new FileOutputStream(new File("day09\\output\\a.txt"));// 能自动创建a.txt文件
        FileOutputStream fos = new FileOutputStream("day09\\output\\a.txt");// 能自动创建a.txt文件
        //FileOutputStream fos = new FileOutputStream("day09\\outputs\\a.txt");// 不能自动创建a.txt文件

        // 2.写字节数据
        fos.write(97);

        // 3.关闭流,释放资源
        fos.close();
    }
}
