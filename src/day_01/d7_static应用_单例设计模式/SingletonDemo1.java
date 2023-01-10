package day_01.d7_static应用_单例设计模式;

//饿汉式  加载字节码文件的时候创建对象
public class SingletonDemo1 {
    //记录对象的变量
    private static SingletonDemo1 sd = new SingletonDemo1();

    //私有构造器
    private SingletonDemo1() {
    }


    //提供公共方法方法
    public static SingletonDemo1 getInstance() {
        return sd;
    }
}
