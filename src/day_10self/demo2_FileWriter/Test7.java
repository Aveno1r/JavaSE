package day_10self.demo2_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) {
        /*
            注意: 字符输出流写出数据后，必须刷新流，或者关闭流，写出去的数据才能生效
            api:
                public void flush();刷新流，就是将内存中缓存的数据立即写到文件中去生效,流可以继续使用
                public void close();关闭流,但同时会刷新流,流不可用继续使用
         */
        try {
            // 1.创建字符输出流对象,关联目的地文件
            FileWriter fw = new FileWriter("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\output\\7.txt");
            // 2.写一个字符数组的部分数据
            char[] chs = {'a','b','c','d','中','国','牛','逼'};
            fw.write(chs,0,4);
            fw.flush();
            fw.write("黑马程序员");
            fw.flush();
            fw.write("关闭流");
            fw.close();
//            fw.write("继续使用--使用不了了");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
