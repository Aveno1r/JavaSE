package day_08.d23_查找指定文件;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        //规律:
        //  接收一个目录,获取该目录下面所有文件或文件夹对象
        //  遍历所有的文件或文件夹的对象
        //  判断是文件还是文件夹
        //  如果是文件,判断是否是要找的文件,如果是,打印出该文件的路径
        //  如果是目录，调用当前方法,重复上述操作。
        //出口
        //  一个目录下面所有的文件获文件夹遍历完后,如果没有文件夹,就不回再向下一次递归。
        //  该目录所有文件遍历完后,该目录的操作自然就结束了

        findFile(new File("D:\\"));
    }

    //提供形参File，该File原则上必须是一个目录。
    public static void findFile(File file) {
        //判断是否是目录
        //if (file.isFile()){
        //    return;
        //}
        //是目录,file不能被访问  这样写是有漏洞的

        //初始目录判断
        if (file.isDirectory()) {
            //是目录，开始干活
            File[] files = file.listFiles();
            System.out.println("file = " + file);
            //file = D:\System Volume Information
            //可能会出现空指针异常。  file如果是一个没有访问权限的文件夹
            //导致listFiles()返回一个null赋值给上面的files
            //底层会通过files获取迭代器对象,相当于通过null进行了操作。

            if (files != null) {
                for (File file1 : files) {//java.lang.NullPointerException
                    //file1可能是目录,可能是文件
                    if (file1.isFile()) {
                        //是文件
                        String name = "idea64.exe";
                        if (file1.getName().equals(name)) {
                            System.out.println("file1.getAbsoluteFile() = " + file1.getAbsoluteFile());
                        }
                    } else if (file1.isDirectory()) {
                        //是目录  递归
                        findFile(file1);
                    }
                }
            }
        } else {
            //不是目录,或不具备访问权限
            System.out.println("您提供的路径可能不是目录,或该目录不能被访问...");
        }


    }
}
