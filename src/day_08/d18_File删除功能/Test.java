package day_08.d18_File删除功能;

import java.io.File;

//File类删除文件的功能
public class Test {
    public static void main(String[] args) {
        File file = new File("day08\\a\\b\\a.txt");
        File file2 = new File("day08\\a\\b");
        //public boolean delete​()
        System.out.println("file.delete() = " + file.delete());

        //注意:只能删空文件夹  防止风险
        System.out.println("file2.delete() = " + file2.delete());

    }
}
