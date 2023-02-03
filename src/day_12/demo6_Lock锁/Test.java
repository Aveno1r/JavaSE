package day_12.demo6_Lock锁;

public class Test {
    public static void main(String[] args) {
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
