package day_09self;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamPra01 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Rescale\\Desktop\\a.txt");
        FileInputStream fis = new FileInputStream(file);
//        byte[] bytes = new byte[20];
//        int length = fis.read(bytes);
//        String s = new String(bytes, 0, 8);
//        System.out.println("s = " + s);
//        for (int i = 0; i < 8; i++) {
//            int read = fis.read();
//            System.out.print((char) read);
//        }
//        fis.close();
        byte[] bytes = new byte[2];
        int len;
        while((len = fis.read(bytes)) != -1){
            String s = new String(bytes,0,len);
            System.out.println(s);
        }
        fis.close();
    }
}
