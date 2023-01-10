package day_10.demo17_commonsio;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3_IOUtils {
    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("day10\\jjj\\mm.jpg");
                FileOutputStream fos = new FileOutputStream("day10\\jjj\\mmCopy2.jpg");
             ){
            // 拷贝
            IOUtils.copy(fis,fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
