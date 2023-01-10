package day_08.d17_File创建功能;

import java.io.File;
import java.io.IOException;

//File类创建文件的功能
public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("day08\\a\\b");
        File file2 = new File("day08\\a\\b\\a.txt");

        //public boolean createNewFile()	创建一个新的空的文件
        //注意:创建文件,文件的父目录必须先存在，否则报异常
        System.out.println("file2.createNewFile() = " + file2.createNewFile());


        //public boolean mkdir()	只能创建一级文件夹
        //注意:创建文件夹,文件夹的父目录必须先存在,不存在,返回false
        System.out.println("file.mkdir() = " + file.mkdir());


        //public boolean mkdirs()	可以创建多级文件夹
        //父级目录不存在,自动创建父级目录
        System.out.println("file.mkdirs() = " + file.mkdirs());
    }
}
