package day_04.d3Api_Runtime;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //public static Runtime getRuntime()	返回与当前Java应用程序关联的运行时对象
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
        System.out.println("(r1==r2) = " + (r1 == r2));//true


        //public void exit​(int status)	终止当前运行的虚拟机
        System.out.println("开始");
        //r1.exit(-1);
        System.out.println("结束");

        //public int availableProcessors()	返回Java虚拟机可用的处理器数。
        System.out.println("当前电脑可用的处理器数量: = " + r1.availableProcessors());

        //public long totalMemory()	返回Java虚拟机中的内存总量
        System.out.println("虚拟机分配的内存 = " + r1.totalMemory());

        //public long freeMemory()	返回Java虚拟机中的可用内存
        System.out.println("虚拟机空余可用的内存 = " + r1.freeMemory());

        //public Process exec​(String command)	启动某个程序，并返回代表该程序的对象
        //command 是程序的全路径(从盘符开始的路径)  D://a/b.txt
        String command="E:\\software\\develop\\XJad\\XJad.exe";
        //String command="E:/software/develop/XJad/XJad.exe";
        r1.exec(command);

    }
}
