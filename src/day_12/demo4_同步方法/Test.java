package day_12.demo4_同步方法;

public class Test {
    public static void main(String[] args) {
        /*
            同步方法:
                概述: 对一个方法中的所有代码加锁,实现同步访问(线程安全)
                格式:
                    修饰符 synchronized 返回值类型 方法名(形参列表){
                        核心代码
                    }

                锁对象:
                    同步方法其实底层也是有隐式锁对象的，只是锁的范围是整个方法代码。
                    如果方法是实例方法：同步方法默认用this作为的锁对象。
                    如果方法是静态方法：同步方法默认用类名.class作为的锁对象。
         */
        // 1.创建账户对象
        Account account = new Account("ICBC-110", 100000);

        // 2.创建小明线程,小红线程,共享同一个账户
        MyThread mt1 = new MyThread("小明线程", account);
        MyThread mt2 = new MyThread("小红线程", account);

        // 3.启动小明和小红线程
        mt1.start();
        mt2.start();
    }
}
