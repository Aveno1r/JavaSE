package day_12.demo3_同步代码块;

public class Test {
    public static void main(String[] args) {
        /*
            同步代码块:
                概述: 对一段代码进行加锁,实现多条线程同步访问(安全访问)
                格式:
                    synchronized(锁对象){
                        加锁的代码---要保证线程安全的代码
                    }
                锁对象:
                    语法角度: 锁对象可以是任意类的对象
                    同步角度: 要实现多条线程同步,这多条线程使用的锁对象必须是同一个对象
                            否则依然会出现线程安全问题\


               锁对象使用规范:
                    建议使用共享资源作为锁对象，对于实例方法建议使用this作为锁对象。
                    对于静态方法建议使用字节码（类名.class）对象作为锁对象。

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
