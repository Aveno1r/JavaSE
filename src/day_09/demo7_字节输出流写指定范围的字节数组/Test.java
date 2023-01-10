package day_09.demo7_字节输出流写指定范围的字节数组;

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
                    public void write(byte[] bys,int position,int length);写指定范围的字节数组
                    public void close();关闭流,释放资源
         */
        // 1.创建字节输出流对象,关联目的地文件
        FileOutputStream fos = new FileOutputStream("day09\\output\\c.txt");// 能自动创建c.txt文件

        // 2.写字节数据
        byte[] bytes = {97,98,99,100};
        fos.write(bytes,0,3);

        // 3.关闭流,释放资源
        fos.close();
    }
}
