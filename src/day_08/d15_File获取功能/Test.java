package day_08.d15_File获取功能;

import java.io.File;
import java.util.Date;
//File获取文件信息功能
public class Test {
    public static void main(String[] args) {
        File file = new File("day08\\a.txt");
        //File file = new File("E:\\workspace\\javaseadvance\\day08\\a.txt");


        //public String getName()	获取文件的名称（包含后缀）
        System.out.println("file.getName() = " + file.getName());

        //public long length()	获取文件的大小，返回字节个数
        System.out.println("file.length() = " + file.length());

        //public long lastModified()	获取文件的最后修改时间。
        System.out.println("file.lastModified() = " + file.lastModified());
        System.out.println("new Date(file.lastModified()) = " + new Date(file.lastModified()));

        //public String getPath()	获取创建文件对象时，使用的路径
        System.out.println("file.getPath() = " + file.getPath());

        //public String getAbsolutePath()	获取绝对路径
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
    }
}
