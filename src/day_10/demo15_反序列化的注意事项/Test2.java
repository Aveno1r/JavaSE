package day_10.demo15_反序列化的注意事项;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test2 {
    public static void main(String[] args) {
        /*
              反序列化的注意事项:
                1.如果序列化之后,反序列化操作的时候找不到类的class文件,就会报ClassNotFoundException异常
                2.如果序列化之后,修改了序列化对象所属的类,反序列化操作的时候就会报异常
                    解决方式:设置序列化版本号常量
                            static final long serialVersionUID = 12L;
         */
        try (
                // 1.创建反序列化流对象,关联目的地文件
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Rescale\\Desktop\\basic\\JavaSE\\input\\person2.txt"));
             ){
            // 2.反序列化---重构对象
            Person p = (Person)ois.readObject();
            System.out.println("p = " + p);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
