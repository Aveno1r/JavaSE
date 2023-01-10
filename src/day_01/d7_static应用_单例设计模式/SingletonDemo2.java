package day_01.d7_static应用_单例设计模式;

//懒汉式 第1次使用对象的时候创建
//体现了延迟加载的思想
public class SingletonDemo2 {
    //记录对象的变量
    private static SingletonDemo2 sd = null;

    //私有构造器
    private SingletonDemo2() {
    }

    //提供公共的访问方式
    public static SingletonDemo2 getInstance() {
        //判断,如果为null,提供一个对象
        if (sd == null) {
            sd = new SingletonDemo2();
        }
        return sd;
    }
}
