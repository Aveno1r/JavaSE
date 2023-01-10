package day_09self.demo2_字节输入流读一个字节;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws Exception {
        /*
            FileInputStream: 表示字节输入流,可以用来读字节数据
                构造方法:
                   public FileInputStream(File file);
                   public FileInputStream(String pathName);
               成员方法:
                   public int read(); 读一个字节,并返回读取到的字节数据,读不到数据了就返回-1作为标识
                   public void close(); 关闭流,释放资源
         */
        // 需求: 使用字节输入流读day09\input\a.txt文件中的数据--每次读一个字节
        // 1.创建字节输入流对象,关联数据源文件
        File file = new File("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\a.txt");
        FileInputStream fis = new FileInputStream(file);
        // 2.读文件中的字节数据--->每次读一个字节
        int read;

        while ((read = fis.read()) != -1){
            System.out.print((char) read + " ");
        }
        fis.close();
    }
}
