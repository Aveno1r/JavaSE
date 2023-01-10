package day_10self.demo10_打印流;

import java.io.PrintStream;

public class Test {
    public static void main(String[] args) {
        /*
            打印流: PrintStream
                作用：打印流可以实现更方便、更高效的打印数据出去，能实现打印啥出去就是啥出去
                构造方法:
                    public PrintStream(String pathName);
                    public PrintStream(String fileName, Charset charset);
                成员方法:
                    public void println(XXX xxx); 打印任意类型的数据
         */
        try (
                // 1.创建打印流对象,关联目的地文件
                PrintStream ps = new PrintStream("day10\\fff\\a.txt");
                //PrintStream ps = new PrintStream("day10\\fff\\aa.txt", Charset.forName("gbk"));
                //PrintWriter ps = new PrintWriter("day10\\fff\\aaa.txt", Charset.forName("gbk"));
             ){
            // 2.打印数据
            ps.println(10);
            ps.println(3.14);
            ps.println(true);
            ps.println("打印流");
            ps.println('a');
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
