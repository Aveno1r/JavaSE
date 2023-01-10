package day_10self.demo4_BufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try (
                // 1.创建字符缓冲输入流对象,关联数据源文件
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\1.txt"));

        ){

            // 2.读行数据
            /*String line = br.readLine();
            System.out.println("line = " + line);

            String line2 = br.readLine();
            System.out.println("line2 = " + line2);

            String line3 = br.readLine();
            System.out.println("line3 = " + line3);

            String line4 = br.readLine();
            System.out.println("line4 = " + line4);

            String line5 = br.readLine();
            System.out.println("line5 = " + line5);// null*/

            // 2. 定义一个String类型的变量,用来存储读取到的行数据
            String line;
            // 3.循环读行数据
            while ((line = br.readLine()) != null){

                // 打印读取到的行数据
                System.out.println("line = " + line);
            }
    } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
