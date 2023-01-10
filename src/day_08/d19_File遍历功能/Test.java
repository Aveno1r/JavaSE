package day_08.d19_File遍历功能;

import java.io.File;

//File类提供的遍历文件夹的功能
public class Test {
    public static void main(String[] args) {
        File file = new File("day08");
        //File file = new File("E:\\workspace\\javaseadvance\\day08");
        //File file2 = new File("day08\\a\\b\\a.txt");
        //File file2 = new File("day08\\a\\b\\aaa.txt");
        File file2 = new File("day08\\b");

        //获取当前目录下所有的文件或文件夹的名字的字符串形式  public String[] list()
        String[] names = file.list();
        for (String name : names) {
            System.out.println("name = " + name);
        }

        //获取当前目录下所有的文件或文件夹的File对象 public File[] listFiles()
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println("file1 = " + file1);
        }

        System.out.println("file2.list() = " + file2.list());
    }
}
