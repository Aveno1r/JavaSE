package day_10self.demo11_DataOutputStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        /*
            DataOutputStream: 数据输出流
                构造方法:
                    public DataOutputStream(OutputStream out)
                成员方法:
                    public final void writeInt(int v)
                    public final void writeDouble(double v)
                    public final void writeBoolean(boolean v)
                    public final void writeUTF(String str)
                    ....
         */
        try (
                // 1.创建数据数据流对象,关联目的地文件
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\a.txt"));
             ){
            // 2.写数据
            dos.writeInt(10);
            dos.writeDouble(3.14);
            dos.writeBoolean(true);
            dos.writeUTF("字符串数据");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
