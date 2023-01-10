package day_08self;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FilePra {
    public static void main(String[] args) throws IOException {
        /*
        public File(String pathname)	根据文件路径创建文件对象
        public File (String parent, String child)	根据父路径和子路径名字创建文件对象
        public File (File  parent, String child)	根据父路径对应文件对象和子路径名字创建文件对象
         */

        File file = new File("C:/Users/Rescale/Desktop/a.txt");
        System.out.println("file = " + file);

        File file1 = new File("C:/Users/Rescale/Desktop", "b.txt");
        System.out.println("file1 = " + file1);
        //file2可以表示File对象创建的文件夹，不仅仅是当文件。
        File file2 = new File("C:/Users/Rescale/Desktop1");
        File file3 = new File(file2, "c.txt");
        System.out.println("file3 = " + file3);

        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        //上面的这些代码操作，File对象只表示可以处理这个路径上文件，File文件并没有创建，仅代表路径。


        /*
        public String getName()	获取文件的名称（包含后缀）
        public long length()	获取文件的大小，返回字节个数
        public long lastModified()	获取文件的最后修改时间。
        public String getPath()	获取创建文件对象时，使用的路径
        public String getAbsolutePath()	获取绝对路径
        public boolean exists()	判断当前文件对象，对应的文件路径是否存在，存在返回true
        public boolean isFile()	判断当前文件对象指代的是否是文件，是文件返回true，反之。
        public boolean isDirectory()	判断当前文件对象指代的是否是文件夹，是文件夹返回true，反之。
         */

        System.out.println("file.getName() = " + file.getName());
        System.out.println("file.length() = " + file.length());
        System.out.println("file.lastModified() = " + file.lastModified());
        System.out.println("file.getPath() = " + file.getPath());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.exists() = " + file.exists());
        System.out.println("file.isFile() = " + file.isFile());
        System.out.println("file.isDirectory() = " + file.isDirectory());

        /*
        public boolean createNewFile()	创建一个新的空的文件
        public boolean mkdir()	只能创建一级文件夹
        public boolean mkdirs()	可以创建多级文件夹
        public boolean delete()	删除文件、空文件夹
         */
        File file4 = new File("C:/Users/Rescale/Desktop/sx/1/1//1/11/2/2");
//        boolean newFile = file4.createNewFile();
//        System.out.println("newFile = " + newFile);
//        boolean mkdir = file4.mkdir();
//        System.out.println("mkdir = " + mkdir);
//        boolean delete = file4.delete();
//        System.out.println("delete = " + delete);
        boolean mkdirs = file4.mkdirs();
        System.out.println("mkdirs = " + mkdirs);
        String path = file4.getPath();
        System.out.println("path = " + path);
        System.out.println("file.lastModified() = " + new Date(file4.lastModified()));

    }
}
