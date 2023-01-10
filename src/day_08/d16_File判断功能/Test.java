package day_08.d16_File判断功能;

import java.io.File;

//File判断文件类型
public class Test {
    public static void main(String[] args) {
        File file1 = new File("day08");
        File file2 = new File("day08\\a.txt");
        File file3 = new File("day08\\b.txt");

        //public boolean exists()	判断当前文件对象，对应的文件路径是否存在，存在返回true
        System.out.println("file1.exists() = " + file1.exists());
        System.out.println("file2.exists() = " + file2.exists());
        System.out.println("file3.exists() = " + file3.exists());

        //public boolean isFile()	判断当前文件对象指代的是否是文件，是文件返回true，反之返回false。
        System.out.println("file1.isFile() = " + file1.isFile());
        System.out.println("file2.isFile() = " + file2.isFile());
        System.out.println("file3.isFile() = " + file3.isFile());


        //public boolean isDirectory()	判断当前文件对象指代的是否是文件夹，是文件夹返回true，反之返回false。
        System.out.println("file1.isDirectory() = " + file1.isDirectory());
        System.out.println("file2.isDirectory() = " + file2.isDirectory());
        System.out.println("file3.isDirectory() = " + file3.isDirectory());
    }
}
