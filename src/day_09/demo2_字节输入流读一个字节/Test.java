package day_09.demo2_字节输入流读一个字节;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

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
        FileInputStream fis = new FileInputStream("day09\\input\\a.txt");
        //FileInputStream fis = new FileInputStream(new File("day09\\input\\a.txt"));

        // 2.读文件中的字节数据--->每次读一个字节
        /*int b1 = fis.read();
        System.out.println("b1 = " + (char)b1);// a

        int b2 = fis.read();
        System.out.println("b2 = " + (char)b2);// b

        int b3 = fis.read();
        System.out.println("b3 = " + (char)b3);// c

        int b4 = fis.read();
        System.out.println("b4 = " + b4);// -1*/

        // 问题: 要读完整个文件中的所有字节数据,需要写很多的重复代码,造成代码冗余
        // 解决: 循环解决

        // 定义一个int类型的变量,用来存储读取到的字节数据
        int b;

        // 由于循环次数未知使用while循环,循环条件: read方法读取到的返回值 != -1
        // while条件:先读一个字节数据,赋值给b,然后拿b的值与-1进行比较判断
        while( (b = fis.read()) != -1){
            // 打印输出读取到的字节数据
            System.out.println((char)b);
        }

        // 3.关闭流,释放资源
        fis.close();
    }
}
