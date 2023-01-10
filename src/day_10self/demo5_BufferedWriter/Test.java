package day_10self.demo5_BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try (
                // 1.创建字符缓冲输出流对象,关联目的地文件
                BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\1.txt"))
        ){

            // 2.写数据和换行
            bw.write("床前明月光");
            bw.newLine();

            bw.write("疑是地上霜");
            bw.newLine();

            bw.write("举头望明月");
            bw.newLine();

            bw.write("低头思姑娘");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
