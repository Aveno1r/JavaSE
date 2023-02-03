package day_12.demo4_同步方法;

public class MyThread extends Thread{

    private Account account;

    public MyThread(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        // 任务: 取钱
        account.drawMoney(100000);
    }
}
