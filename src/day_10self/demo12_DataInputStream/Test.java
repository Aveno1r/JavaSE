package day_10self.demo12_DataInputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try(
                // 1.创建数据输入流对象,关联数据源文件
                DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\a.txt"));
            ){
            // 2.读数据
            int num = dis.readInt();
            double numD = dis.readDouble();
            boolean res = dis.readBoolean();
            String str = dis.readUTF();
            System.out.println("num = " + num);// 10
            System.out.println("numD = " + numD);// 3.14
            System.out.println("res = " + res);// true
            System.out.println("str = " + str);// 字符串数据
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
