package day_09.demo8_字节输出流写换行;

import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) throws Exception{
        /*
            床前明月光
            疑是地上霜
            举头望明月
            低头思姑娘
         */
        // 1.创建字节输出流对象,关联目的地文件
        FileOutputStream fos = new FileOutputStream("day09\\output\\d.txt");

        // 2.写字节数据
        fos.write("床前明月光\r\n".getBytes());
        fos.write("疑是地上霜\r\n".getBytes());
        fos.write("举头望明月\r\n".getBytes());
        fos.write("低头思姑娘\r\n".getBytes());

        // 3.关闭流,释放资源
        fos.close();

    }
}
