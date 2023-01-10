package day_09self.demo9_字节输出流追加续写;

import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args)throws Exception {
          /*
            FileOutputStream: 字节输出流,用来写字节数据到文件中
                构造方法:
                    public FileOutputStream(File file,boolean append);可实现追加续写
                    public FileOutputStream(String pathName,boolean append);可实现追加续写
                    注意:
                        1.如果指定的文件不存在,字节输出流会自动创建一个新的空文件,但前提是父目录必须真实存在
                        2.如果父目录不存在,字节输出流不会自动创建该新的空文件,报文件找不到异常
                        3.如果文件存在,是否清空原文件中的数据,得看第二个boolean类型的参数:
                            如果为false,就会清空原文件中的数据,然后再写数据
                            如果为true,就不会清空原文件中的数据,直接在末尾追加续写数据
         */
        // 1.创建字节输出流对象,关联目的地文件
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\b.txt",true);// 追加续写
        //FileOutputStream fos = new FileOutputStream("day09\\output\\e.txt",false);// 覆盖
        byte[] bytes = {'c','a','o','n','i','m','a'};
        // 2.写字节数据
        fos.write(bytes);

        // 3.关闭流,释放资源
        fos.close();

    }
}
