package day_09self.demo3_字节输入流读多个字节;

import java.io.FileInputStream;

public class Test3 {
    public static void main(String[] args) throws Exception{
        /*
            FileInputStream:
                public int read(byte[] b);读取字节数组长度个字节数据,把读取到的字节数据存储在字节数组中
                                          返回读取到的字节个数,如果读取不到数据了就返回-1作为标识

           String类:
                public String(byte[] bytes,int offset,int length);把字节数组中指定范围的字节数据转换为字符串
                参数1: 字节数组
                参数2: 要转换的起始索引位置
                参数3: 要转换的字节个数
         */
        // 需求: 使用字节输入流读day09\input\a.txt文件中的数据--每次读多个字节
        // 1.创建字节输入流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\a.txt");
        // 2.定义一个字节数组,用来存储读取到的字节数据
        byte[] bytes = new byte[2];

        int len;
        while ((len = fis.read(bytes)) != -1){
            String s = new String(bytes, 0, len);
            System.out.println(s);
        }
        // 3.关闭流,释放资源
        fis.close();


    }
}
