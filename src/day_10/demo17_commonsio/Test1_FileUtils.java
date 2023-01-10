package day_10.demo17_commonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Test1_FileUtils {
    public static void main(String[] args) throws IOException {
        File srcF = new File("day10\\jjj\\mm.jpg");
        File destF = new File("day10\\jjj\\mmCopy1.jpg");
        FileUtils.copyFile(srcF,destF);
    }
}
