package day_10self.demo10_打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test2 {
    public static void main(String[] args) throws FileNotFoundException {
        //System.out.println("老骥伏枥");
        //System.out.println("志在千里");
        //System.out.println("烈士暮年");
        //System.out.println("壮心不已");

        // 需求: System.out.println()输出的目的地为文件,而不是控制台
        // 解决: 修改System.out的打印流对象
        // 创建打印流对象
        PrintStream ps = new PrintStream("day10\\fff\\b.txt");
        // 修改System类的out属性值
        System.setOut(ps);
        // 使用Sytem类的out属性值(打印流)
        System.out.println("老骥伏枥");
        System.out.println("志在千里");
        System.out.println("烈士暮年");
        System.out.println("壮心不已");
    }
}
