package day_08.d14_绝对路径_相对路径;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        //举例:表示day08模块下面的,src下面的d14_绝对路径_相对路径包下面的a.txt文件。

        //绝对路径:完整的路径(从盘符开始的路径)
        File file = new File("F:\\workspace\\javaseadvance\\day08\\src\\com\\itheima\\d14_绝对路径_相对路径\\a.txt");
        //获取绝对路径
        System.out.println("file.getAbsoluteFile() = " + file.getAbsoluteFile());

        //相对路径:针对不同的开发环境而言。java程序,在idea工具中,"相对于项目"存在的路径
        File file2 = new File("day08\\src\\com\\itheima\\d14_绝对路径_相对路径\\a.txt");
        System.out.println("file2.getAbsoluteFile() = " + file2.getAbsoluteFile());

        //相对路径
        //.代表当前路径
        File file3 = new File(".");
        System.out.println("file3.getAbsoluteFile() = " + file3.getAbsoluteFile());
        //..代表上一级路径
        File file4 = new File("..");
        System.out.println("file4.getAbsoluteFile() = " + file4.getAbsoluteFile());

    }
}
