package day_08.d13_File类对象;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        //表示D盘下面的a目录下面的,b.txt文件

        //public File​(String pathname)	根据文件路径创建文件对象
        //\是转义字符,需要将原有的转义字符串,转义为普通的斜杠。
        //File file = new File("D:\\a\\b.txt");
        //也可以使用单个反斜杠,作为目录的层级
        File file = new File("D:/a/b.txt");

        //public File​(String parent, String child)	根据父路径和子路径名字创建文件对象
        //child一般具体的文件获文件夹的名字 parent一般表示文件之间的路径
        File file2 = new File("D:/a", "b.txt");

        //public File​(File  parent, String child)	根据父路径对应文件对象和子路径名字创建文件对象
        //File不光可以表示文件,也可以表示文件夹
        File f = new File("D:/a");
        File file3 = new File(f, "b.txt");


        //实际上,上面的File对象仅仅表示的是 “‪D:\a\b.txt”这个路径,至于到底有没有这个文件,跟这里的File对象无关。
        //换个说法,就是说上面的File对象,表示的是“‪D:\a\b.txt”这个路径。
        //可以通过File对这个路径进程处理,比如,按照这个路径创建一个对应的文件
    }
}
