package day_08.d24_删除指定文件_慎重操作;

import java.io.File;
import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {
        //规律:
        //  接收一个目录,获取该目录下面所有文件或文件夹对象
        //  遍历所有的文件或文件夹的对象
        //  判断是文件还是文件夹
        //  如果是文件,删除该文件
        //  如果是目录，调用当前方法,重复上述操作。

        //  上述操作结束,意味着当前目录下所有的内容删除完成,删除当前目录
        //出口
        //  一个目录下面所有的文件获文件夹遍历完后,如果没有文件夹,就不回再向下一次递归。
        //  该目录所有文件遍历完后,该目录的操作自然就结束了

        delete(new File("D:\\a"));
    }
    //删除目录
    public static void delete(File file){

        if (file.isDirectory()){
            //如果file不可访问,files得到一个null
            File[] files = file.listFiles();
            if (files!=null){
                //遍历当前目录下所有的文件和文件夹
                //for结束,意味着当前目录下所有的文件和文件夹已经被删除
                for (File file1 : files) {
                    if (file1.isFile()){
                        file1.delete();
                    }else if (file1.isDirectory()){
                        delete(file1);
                    }
                }
            }
            //上述操作结束,意味着当前目录下所有的内容都已经被删除
            file.delete();
        }


    }
}
