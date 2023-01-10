package day_04self;

import java.io.IOException;

public class RuntimePractice {
    public static void main(String[] args) throws IOException {
//        public static Runtime getRuntime()	返回与当前Java应用程序关联的运行时对象
//        public void exit(int status)	终止当前运行的虚拟机
//        public int availableProcessors()	返回Java虚拟机可用的处理器数。
//        public long totalMemory()	返回Java虚拟机中的内存总量
//        public long freeMemory()	返回Java虚拟机中的可用内存
//        public Process exec(String command)	启动某个程序，并返回代表该程序的对象
        Runtime com = Runtime.getRuntime();
        System.out.println(com);

        System.out.println("com.availableProcessors() = " + com.availableProcessors());

        System.out.println("com.totalMemory() = " + com.totalMemory());

        System.out.println("com.freeMemory() = " + com.freeMemory());

        String command = "D:/微信/WeChat/WeChat.exe";
        System.out.println("com.exec(command) = " + com.exec(command));
    }

}
