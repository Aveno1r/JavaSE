package day_10self.demo17_commonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileUtils1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\1.jpg");
        File file1 = new File("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\1copy.jpg");
        try {
            FileUtils.copyFile(file,file1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
