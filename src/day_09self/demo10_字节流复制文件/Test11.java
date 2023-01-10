package day_09self.demo10_字节流复制文件;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test11 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\2.wav");

        FileOutputStream fos = new FileOutputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\output\\2.wav");

        int content;
        while ((content = fis.read()) != -1){
            fos.write(content);
        }

        fis.close();
        fos.close();
    }
}
